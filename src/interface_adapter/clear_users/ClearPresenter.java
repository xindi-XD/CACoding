package interface_adapter.clear_users;

// TODO Complete me
// TODO I don't think I need extra interface_adapters.
// TODO Does all viewManagerModel functions have correct corresponding method?
import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;
    // TODO What is that?

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData cleared) {
        // On success, switch to clear view.

        ClearState clearState = clearViewModel.getClearState();
        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();

        this.viewManagerModel.setActiveView(clearViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getClearState();
        clearState.setOperationError(error);
        // TODO Above looks weird.
        clearViewModel.firePropertyChanged();
    }
}
