package com.hp.QppColumbia.services.entity;

import java.util.List;

public class AccountSummaryFilterDetails {
    private String homologatedName;
    private String razonSocial;
    private String taxId;
    private String locationId;
    private String suppliesStatus;
	private String mpa;
	private String largeFormatStatus;
	private String hpsHardwareStatus;
	private String opsHardwareStatus;
	private String bpsStatus;

	public String getMpa() {
		return mpa;
	}

	public void setMpa(String mpa) {
		this.mpa = mpa;
	}

	public String getLargeFormatStatus() {
		return largeFormatStatus;
	}

	public void setLargeFormatStatus(String largeFormatStatus) {
		this.largeFormatStatus = largeFormatStatus;
	}

	public String getOpsHardwareStatus() {
		return opsHardwareStatus;
	}

	public void setOpsHardwareStatus(String opsHardwareStatus) {
		this.opsHardwareStatus = opsHardwareStatus;
	}

	public String getBpsStatus() {
		return bpsStatus;
	}

	public void setBpsStatus(String bpsStatus) {
		this.bpsStatus = bpsStatus;
	}

	public String getHpsHardwareStatus() {
		return hpsHardwareStatus;
	}

	public void setHpsHardwareStatus(String hpsHardwareStatus) {
		this.hpsHardwareStatus = hpsHardwareStatus;
	}

	public String getHomologatedName() {
        return homologatedName;
    }

    public void setHomologatedName(String homologatedName) {
        this.homologatedName = homologatedName;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getSuppliesStatus() {
        return suppliesStatus;
    }

    public void setSuppliesStatus(String suppliesStatus) {
        this.suppliesStatus = suppliesStatus;
    }
}