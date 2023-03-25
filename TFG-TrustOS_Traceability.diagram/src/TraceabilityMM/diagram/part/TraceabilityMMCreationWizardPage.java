/*
 * 
 */
package TraceabilityMM.diagram.part;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @generated
 */
public class TraceabilityMMCreationWizardPage extends WizardNewFileCreationPage {

	/**
	* @generated
	*/
	private final String fileExtension;

	/**
	* @generated
	*/
	public TraceabilityMMCreationWizardPage(String pageName, IStructuredSelection selection, String fileExtension) {
		super(pageName, selection);
		this.fileExtension = fileExtension;
	}

	/**
	 * Override to create files with this extension.
	 * 
	 * @generated
	 */
	protected String getExtension() {
		return fileExtension;
	}

	/**
	* @generated
	*/
	public URI getURI() {
		return URI.createPlatformResourceURI(getFilePath().toString(), false);
	}

	/**
	* @generated
	*/
	protected IPath getFilePath() {
		IPath path = getContainerFullPath();
		if (path == null) {
			path = new Path(""); //$NON-NLS-1$
		}
		String fileName = getFileName();
		if (fileName != null) {
			path = path.append(fileName);
		}
		return path;
	}

	/**
	* @generated
	*/
	public void createControl(Composite parent) {
		super.createControl(parent);
		setFileName(TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorUtil
				.getUniqueFileName(getContainerFullPath(), getFileName(), getExtension()));
		setPageComplete(validatePage());
	}

	/**
	* @generated
	*/
	protected boolean validatePage() {
		if (!super.validatePage()) {
			return false;
		}
		String extension = getExtension();
		if (extension != null && !getFilePath().toString().endsWith("." + extension)) {
			setErrorMessage(NLS.bind(
					TraceabilityMM.diagram.part.Messages.TraceabilityMMCreationWizardPageExtensionError, extension));
			return false;
		}
		return true;
	}
}
