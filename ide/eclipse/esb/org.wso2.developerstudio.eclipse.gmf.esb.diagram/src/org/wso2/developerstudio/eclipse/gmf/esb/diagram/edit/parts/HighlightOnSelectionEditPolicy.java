/*
 * Copyright 2013 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.gef.editpolicies.SelectionEditPolicy;
import org.eclipse.swt.graphics.Color;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditPartDrawingHelper;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.FixedSizedAbstractMediator;


public class HighlightOnSelectionEditPolicy extends SelectionEditPolicy {
	
	protected void showSelection() {
		setselected(true);
	}

	protected void hideSelection() {
		setselected(false);
	}
		
	private void setselected(boolean isselected) {
		Color col = EditPartDrawingHelper.FigureNormalColor;
		if (isselected) { 
			col = EditPartDrawingHelper.FigureSelectedColor;
		}
		
		if(getHost() instanceof FixedSizedAbstractMediator) {
			FixedSizedAbstractMediator mediator = (FixedSizedAbstractMediator)getHost();
			//if (mediator.getFixedSizedPrimaryShape() != null){
				mediator.getFixedSizedPrimaryShape().setBackgroundColor(col);
		}

	}

}
