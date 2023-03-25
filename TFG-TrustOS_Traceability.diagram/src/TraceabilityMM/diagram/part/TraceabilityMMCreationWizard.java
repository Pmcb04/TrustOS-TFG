/*
 * 
 */
package TraceabilityMM.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class TraceabilityMMCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected TraceabilityMM.diagram.part.TraceabilityMMCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected TraceabilityMM.diagram.part.TraceabilityMMCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(TraceabilityMM.diagram.part.Messages.TraceabilityMMCreationWizardTitle);
		setDefaultPageImageDescriptor(TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewTraceabilityMMWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new TraceabilityMM.diagram.part.TraceabilityMMCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "trust"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(TraceabilityMM.diagram.part.Messages.TraceabilityMMCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				TraceabilityMM.diagram.part.Messages.TraceabilityMMCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new TraceabilityMM.diagram.part.TraceabilityMMCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "trustd") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".trust".length()); //$NON-NLS-1$
					setFileName(TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "trustd")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(TraceabilityMM.diagram.part.Messages.TraceabilityMMCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				TraceabilityMM.diagram.part.Messages.TraceabilityMMCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								TraceabilityMM.diagram.part.Messages.TraceabilityMMCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						TraceabilityMM.diagram.part.Messages.TraceabilityMMCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
