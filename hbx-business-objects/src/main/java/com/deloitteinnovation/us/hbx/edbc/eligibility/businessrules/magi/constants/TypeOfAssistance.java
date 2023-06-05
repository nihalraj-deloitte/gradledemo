package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum TypeOfAssistance {

    NEWBORN("TP45"),
    CHL1("CHL1"),
    CHL2("CHL2"),
    CHL3("CHL3"),
    CHL4("CHL4"),
    CHEX("CHEX"),
    CHIP("CHIP"),
    CONV("CONV"),
    ADLT("ADLT"),
    ADBH("ADBH"),
    PACA("PACA"),
    PREG("PREG"),
    FFS1("FFS1"),
    FFS2("FFS2"),
    FFCC("FFCC"),
    QHCP("QHCP"),
    APTC("APTC"),
    NMME("NMME"),
    NONE("NONE"),
    ESHI("ESHI"),
    EMC1("EMC1"),
    EMC2("EMC2"),
    EMC3("EMC3"),
    EMC4("EMC4"),
    SSIR("SSIR"),
    ASMA("ASMA"),
    FCMA("FCMA"),
    DJJM("DJJM"),
    SSPP("SSPP"),
    SSPM("SSPM"),
    EXPT("EXPT"),
    PTCC("PTCC"),
    PTDC("PTDC"),
    PTEW("PTEW"),
    ABDM("ABDM"),
    LTCM("LTCM"),
    MAWR("MAWR"),
    SPDN("SPDN"),
    EMCA("EMCA"),
    QMBP("QMBP"),
    SLMB("SLMB"),
    QI1P("QI1P"),
    QDWI("QDWI"),
    SSIP("SSIP"),
    SPMA("SPMA"),
    TMAE("TMAE"),
    TMAS("TMAS"),
    TMCE("TMCE"),
    TMCS("TMCS"),
    ADPR("ADPR"),
    ADFF("ADFF"),
    FFOS("FFOS"),
    QMBC("QMBC");


    private final String value;


    TypeOfAssistance(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
