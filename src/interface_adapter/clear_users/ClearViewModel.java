package interface_adapter.clear_users;

import interface_adapter.signup.SignupViewModel;

// TODO Complete me

public class ClearViewModel extends SignupViewModel {
    // Above might conflict with SignupViewModel. In fact, SignupView should not
    // import both view models.
    private ClearState state = new ClearState();
    public ClearViewModel(){
        super(); // TODO So it can't be super class of anything? Not sure how super works.
    }

    public void setState(ClearState state) {
        this.state = state;
    }

//    public final PropertyChangeSupport support = new PropertyChangeSupport(this);

//    @Override
//    public void firePropertyChanged() {
//        support.firePropertyChange("state", null, this.state);
//    }

//    @Override
//    public void addPropertyChangeListener(PropertyChangeListener listener) {
//        support.addPropertyChangeListener(listener);
//    }

    public ClearState getClearState() {return state;}
}
