package com.patterns.structural.bridge;

public class CorolaL extends AbstractCorola {

    private  AbstractCorolaImpl corolaImpl;

    public CorolaL(AbstractCorolaImpl corolaImpl) {
        this.corolaImpl = corolaImpl;
    }

    @Override
    public void listSafeteyRating() {
        corolaImpl.listSafeteyRating();
    }

    @Override
    public boolean isCarRightHanded() {
        return corolaImpl.isCarRightHanded();
    }

    public AbstractCorolaImpl getCorolaImpl() {
        return corolaImpl;
    }

    public void setCorolaImpl(AbstractCorolaImpl corolaImpl) {
        this.corolaImpl = corolaImpl;
    }
}
