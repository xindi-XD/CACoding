package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface clearDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.clearDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        clearDataAccessObject.delete();
        // Delete every user.
        ClearOutputData clearOutputData = new ClearOutputData(false);
        clearPresenter.prepareSuccessView(clearOutputData);
        // Prepare success view.
    }
}
