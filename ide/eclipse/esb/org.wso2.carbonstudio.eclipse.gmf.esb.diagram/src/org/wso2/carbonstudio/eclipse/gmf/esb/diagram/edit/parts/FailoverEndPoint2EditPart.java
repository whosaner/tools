package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.DefaultSizeCaseBranchPointerNodeFigure;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.EsbGraphicalShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.EvenlyDividedFixedBorderItemLocator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.ShowPropertyViewEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.FailoverEndPoint2CanonicalEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.FailoverEndPoint2ItemSemanticEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated
 */
public class FailoverEndPoint2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3384;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public FailoverEndPoint2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new FailoverEndPoint2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new FailoverEndPoint2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// For handle Double click Event.
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new ShowPropertyViewEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (EsbVisualIDRegistry.getVisualID(childView)) {
				case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
				case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
				case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new FailoverEndPointFigure();
	}

	/**
	 * @generated
	 */
	public FailoverEndPointFigure getPrimaryShape() {
		return (FailoverEndPointFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		int outputCount = arrangeOutputConnectors();
		if (childEditPart instanceof FailoverEndPointEndPointName2EditPart) {
			((FailoverEndPointEndPointName2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFailoverEndPointNamePropertyLabel());
			return true;
		}
		if (childEditPart instanceof FailoverEndPointInputConnectorEditPart) {

			IFigure borderItemFigure = ((FailoverEndPointInputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.WEST,
					0.25);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;
		}
		if (childEditPart instanceof FailoverEndPointOutputConnectorEditPart) {

			IFigure borderItemFigure = ((FailoverEndPointOutputConnectorEditPart) childEditPart)
					.getFigure();
			getBorderedFigure()
					.getBorderItemContainer()
					.add(borderItemFigure,
							new EvenlyDividedFixedBorderItemLocator(
									getMainFigure(),
									borderItemFigure,
									PositionConstants.EAST,
									((DefaultSizeCaseBranchPointerNodeFigure) borderItemFigure)
											.getId(), outputCount));
			return true;
		}
		if (childEditPart instanceof FailoverEndPointWestOutputConnectorEditPart) {
			IFigure borderItemFigure = ((FailoverEndPointWestOutputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.WEST,
					0.75);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FailoverEndPointEndPointName2EditPart) {
			return true;
		}
		if (childEditPart instanceof FailoverEndPointInputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((FailoverEndPointInputConnectorEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof FailoverEndPointOutputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((FailoverEndPointOutputConnectorEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof FailoverEndPointWestOutputConnectorEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((FailoverEndPointWestOutputConnectorEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(EsbVisualIDRegistry
				.getType(FailoverEndPointEndPointName2EditPart.VISUAL_ID));
	}

	public int arrangeOutputConnectors() {

		@SuppressWarnings("rawtypes")
		List childParts = this.getChildren();
		List<FailoverEndPointOutputConnectorEditPart> outputParts = new ArrayList<FailoverEndPointOutputConnectorEditPart>();

		int id = 1;
		for (Object editpart : childParts) {
			if (editpart instanceof FailoverEndPointOutputConnectorEditPart) {
				FailoverEndPointOutputConnectorEditPart output = (FailoverEndPointOutputConnectorEditPart) editpart;
				outputParts.add(output);
			}
		}
		int outputCount = outputParts.size();

		for (FailoverEndPointOutputConnectorEditPart caseBranchEditpart : outputParts) {
			// if (((DefaultSizeCaseBranchPointerNodeFigure) caseBranch
			// .getFigure()).getId() == -1) {
			((DefaultSizeCaseBranchPointerNodeFigure) caseBranchEditpart
					.getFigure()).setId(id++);
			EvenlyDividedFixedBorderItemLocator borderItemLocator = (EvenlyDividedFixedBorderItemLocator) caseBranchEditpart
					.getBorderItemLocator();
			if (borderItemLocator != null) {
				borderItemLocator.setSiblingCount(outputCount);
			}
			// }
		}

		return outputCount;
	}

	/**
	 * @generated
	 */
	public class FailoverEndPointFigure extends EsbGraphicalShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFailoverEndPointNamePropertyLabel;

		/**
		 * @generated
		 */
		public FailoverEndPointFigure() {

			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureFailoverEndPointNamePropertyLabel = new WrappingLabel();
			fFigureFailoverEndPointNamePropertyLabel.setText("<...>");
			fFigureFailoverEndPointNamePropertyLabel.setAlignment(SWT.CENTER);

			this.getPropertyValueRectangle1().add(
					fFigureFailoverEndPointNamePropertyLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFailoverEndPointNamePropertyLabel() {
			return fFigureFailoverEndPointNamePropertyLabel;
		}

		public String getIconPath() {
			return "icons/ico20/failover-endpoint.gif";
		}

		public String getNodeName() {
			return "Fail-EP";
		}

		public Color getBackgroundColor() {
			return THIS_BACK;
		}

		public Color getLabelBackColor() {
			return THIS_LABEL_BACK;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 40, 151, 248);

	static final Color THIS_LABEL_BACK = new Color(null, 255, 225, 194);

}
