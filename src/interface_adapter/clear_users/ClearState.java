package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String operationError = null;
    public ClearState(ClearState copy){
        operationError = copy.operationError;
    }

    public ClearState(){}

    public void setOperationError(String operationError){
        this.operationError = operationError;
    }
}
