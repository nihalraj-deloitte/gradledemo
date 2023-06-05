package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum TpCodePriority {
    QHCP(1200),
    ESHI(1300),
    FFCC(3210),
    PREG(3200),
    TP45(3300),
    CHL4(3400),
    CHL1(3500),
    CHL2(3600),
    CHL3(3700),
    CHEX(3800),
    CONV(3900),
    CHIP(4000),
    PACA(4100),
    FFS1(4200),
    ADLT(4300),
    ADBH(4400),
    FFS2(4500),
    APTC(6000),
    NMME(9000),
    TP_HIGH(9999),
    SSIR(100),
    ASMA(200),
    FCMA(300),
    DJJM(400),
    SSPP(500),
    SSPM(600),
    EXPT(700),
    PTCC(800),
    PTDC(900),
    PTEW(1000),
    ABDM(1100),
    LTCM(1400),
    MAWR(1500),
    SPDN(6100),
    EMCA(1600),
    QMBP(6200),
    SLMB(6300),
    QI1P(6400),
    QDWI(6500),
    SSIP(1050),
    TMAE(4130),
    TMAS(4160),
    TMCE(4030),
    TMCS(4060),
    ADPR(3150),
    ADFF(3250),
    FFOS(3280),
    EMC1(4910),
    EMC2(4920),
    EMC3(4930),
    EMC4(4940),
    QMBC(6600);


    private final Integer value;

    TpCodePriority(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }


}
