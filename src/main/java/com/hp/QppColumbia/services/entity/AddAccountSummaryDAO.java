package com.hp.QppColumbia.services.entity;

import lombok.Data;

import javax.persistence.Column;

@Data
public class AddAccountSummaryDAO {

    private String homologatedName;

    private String razonSocial;

    private String dba;

    private String taxID;

    private String locationID;

    private String partnerID;

    private String agreement;

    private String tier;

    private String suppliesStatus;

    private String qdnApplicationForm;

    private String hpsHardwareStatus;

    private String opsHardwareStatus;

    private String bpsStatus;

    private String hpContactName;

    private String hpContactEmail;

    private String resellerContactName;

    private String resellerContactEmail;

    private String resellerContactPhone;

    private String resellerWebAddress;

    private String resellerPhysicalAddress;

    private String cityOrDistrict;

    private String stateOrRegion;

    private String zipCode;

    private String membershipForPc;

    private String membershipForPrint;

    private String amplifyMembershipForSupplies;

    private String qdnStartDate;

    private String qdnEndDate;

    private String commentsORNotes;

    private String mpa;

    private String largeFormatStatus;

}