package com.patterns.structural.bridge;

public class CorolaCustomer {

    public static void main(String[] args) {

        CorolaLNorthAmerica corolaLNorthAmerica = new CorolaLNorthAmerica();
        CorolaL corolaL = new CorolaL(corolaLNorthAmerica);
        corolaL.listSafeteyRating();
        corolaL.isCarRightHanded();

        // note: client can change implementation
        corolaL.setCorolaImpl(new CorolaLAsiaPacific());
        corolaL.listSafeteyRating();
        corolaL.isCarRightHanded();
    }

}
