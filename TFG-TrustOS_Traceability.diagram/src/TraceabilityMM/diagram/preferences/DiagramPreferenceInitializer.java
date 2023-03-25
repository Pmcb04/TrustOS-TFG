/*
 * 
 */
package TraceabilityMM.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		TraceabilityMM.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		TraceabilityMM.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		TraceabilityMM.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		TraceabilityMM.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		TraceabilityMM.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
