/*
 * 
 */
package TraceabilityMM.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
