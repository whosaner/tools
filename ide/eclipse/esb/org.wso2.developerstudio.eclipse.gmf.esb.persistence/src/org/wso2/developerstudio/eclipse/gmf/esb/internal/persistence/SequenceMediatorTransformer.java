package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.LogMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.SequenceInfo;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;


public class SequenceMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// Check subject.
		Assert.isTrue(subject instanceof Sequence, "Invalid subject.");
		Sequence visualSequence = (Sequence) subject;
		org.apache.synapse.mediators.base.SequenceMediator sequence =new SequenceMediator();
		org.apache.synapse.mediators.base.SequenceMediator refferingSequence =new SequenceMediator();
		sequence.setName(visualSequence.getName());
		Value value=new Value(visualSequence.getName());
		refferingSequence.setKey(value);
		
		//System.out.println(EsbSequenceMultiPageEditor.sequenceGraphicalEditor.getDiagram().getElement().getClass());
		//EsbDiagram sequenceDiagram=(EsbDiagram) EsbSequenceMultiPageEditor.sequenceGraphicalEditor.getDiagram().getElement();
		//sequenceDiagram.
		/*EsbSequence server= sequenceDiagram.getServer();
		for(int i=0;i<server.getChildren().size();++i){
		System.out.println("aaaaaaaaaaaa"+server.getChildren().get(i));
		}
		*/
		
		try{
			if(information.getSynapseConfiguration()!=null){
				information.getSynapseConfiguration().addSequence(visualSequence.getName(),sequence );
			}
		}
		catch(org.apache.synapse.SynapseException e){
			e.printStackTrace();
			//Should handle properly
			//Duplicate sequence definition for key
		}
		try {
			if ((information.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.EndPoint)&&
					(visualSequence.getOutputConnector().getOutgoingLink().getTarget().eContainer() instanceof EndPoint)) {
				if(information.getParentSequence()!=null){
					Object lastMediator = information
							.getParentSequence()
							.getList()
							.get(information.getParentSequence().getList().size() - 1);
					((SendMediator) lastMediator)
							.setReceivingSequence(refferingSequence.getKey());
				}
			} else {
				information.getParentSequence().addChild(refferingSequence);
			}
		} catch (ClassCastException e) {
			MessageDialog
					.openError(
							Display.getCurrent().getActiveShell(),
							"Diagram Incomplete ! ",
							"If there are two Sequences connected to an Endpoint's in and out terminals, the Sequence which is connected to the in terminal must have a Send mediator as the last mediator of the Sequence.");
		}
		/* Disabling sequence serialation
		information.currentSequence=visualSequence;
		information.setCurrentReferredSequence(sequence);
	
		doTransformWithinSequence(information, SequenceInfo.sequenceMap.get(visualSequence.getName()),sequence); */
		doTransform(information,
				((Sequence)subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}


	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// Check subject.
		Assert.isTrue(subject instanceof Sequence, "Invalid subject.");
		Sequence visualSequence = (Sequence) subject;
		org.apache.synapse.mediators.base.SequenceMediator refferingSequence =new SequenceMediator();
		Value value=new Value(visualSequence.getName());
		refferingSequence.setKey(value);
		
		sequence.addChild(refferingSequence);
		doTransformWithinSequence(information,visualSequence.getOutputConnector().getOutgoingLink(),sequence);		
	}

}
