package com.hp.QppColumbia.services.entity;

import java.util.List;

public class ASFilterResponse {
    private List<String> homologatedName;
    private List<String> razonSocial;
    private List<String> taxId;
    private List<String> locationId;
    private List<String> suppliesStatus;
    private List<String> mpa;
    private List<String> largeFormatStatus;
	private List<String> hpsHardwareStatus;
	private List<String> opsHardwareStatus;
	private List<String> bpsStatus;

	public List<String> getMpa() {
		return mpa;
	}

	public void setMpa(List<String> mpa) {
		this.mpa = mpa;
	}

	public List<String> getLargeFormatStatus() {
		return largeFormatStatus;
	}

	public void setLargeFormatStatus(List<String> largeFormatStatus) {
		this.largeFormatStatus = largeFormatStatus;
	}

	public List<String> getHpsHardwareStatus() {
		return hpsHardwareStatus;
	}

	public void setHpsHardwareStatus(List<String> hpsHardwareStatus) {
		this.hpsHardwareStatus = hpsHardwareStatus;
	}

	public List<String> getOpsHardwareStatus() {
		return opsHardwareStatus;
	}

	public void setOpsHardwareStatus(List<String> opsHardwareStatus) {
		this.opsHardwareStatus = opsHardwareStatus;
	}

	public List<String> getBpsStatus() {
		return bpsStatus;
	}

	public void setBpsStatus(List<String> bpsStatus) {
		this.bpsStatus = bpsStatus;
	}

	public List<String> getHomologatedName() {
        return homologatedName;
    }

    public void setHomologatedName(List<String> homologatedName) {
        this.homologatedName = homologatedName;
    }

    public List<String> getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(List<String> razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<String> getTaxId() {
        return taxId;
    }

    public void setTaxId(List<String> taxId) {
        this.taxId = taxId;
    }

    public List<String> getLocationId() {
        return locationId;
    }

    public void setLocationId(List<String> locationId) {
        this.locationId = locationId;
    }

    public List<String> getSuppliesStatus() {
        return suppliesStatus;
    }

    public void setSuppliesStatus(List<String> suppliesStatus) {
        this.suppliesStatus = suppliesStatus;
    }
}