/*
* 
*/
package TraceabilityMM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class TraceabilityMMNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7009;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7008;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem) {
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem item = (TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
