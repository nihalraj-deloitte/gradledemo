package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualAlienSponsorIncomeAndResourceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DSNAPResourceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.NoResourceVerificationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ResourceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.TransferredResourceModel;

import java.util.ArrayList;
import java.util.List;

public class ResourceDataStore {
    private List<String> AvailableResources = new ArrayList<String>();

    public List<String> getAvailableResources() {
        return AvailableResources;
    }

    public void setAvailableResources(List<String> value) {
        AvailableResources = value;
    }

    private List<DCIndividualAlienSponsorIncomeAndResourceModel> DCIndividualAlienSponsorIncomeAndResourceModels = new ArrayList<>();

    public List<DCIndividualAlienSponsorIncomeAndResourceModel> getDCIndividualAlienSponsorIncomeAndResourceModels() {
        return DCIndividualAlienSponsorIncomeAndResourceModels;
    }

    public void setDCIndividualAlienSponsorIncomeAndResourceModels(List<DCIndividualAlienSponsorIncomeAndResourceModel> value) {
        DCIndividualAlienSponsorIncomeAndResourceModels = value;
    }

    private List<DSNAPResourceModel> DSNAPResourceModels = new ArrayList<>();

    public List<DSNAPResourceModel> getDSNAPResourceModels() {
        return DSNAPResourceModels;
    }

    public void setDSNAPResourceModels(List<DSNAPResourceModel> value) {
        DSNAPResourceModels = value;
    }

    private List<ResourceModel> ResourceModels = new ArrayList<>();

    public List<ResourceModel> getResourceModels() {
        return ResourceModels;
    }

    public void setResourceModels(List<ResourceModel> value) {
        ResourceModels = value;
    }

    private List<TransferredResourceModel> TransferredResourceModels = new ArrayList<>();

    public List<TransferredResourceModel> getTransferredResourceModels() {
        return TransferredResourceModels;
    }

    public void setTransferredResourceModels(List<TransferredResourceModel> value) {
        TransferredResourceModels = value;
    }


    private List<TransferredResourceModel> TransferredResourceMonthlyModels = new ArrayList<>();

    public List<TransferredResourceModel> getTransferredResourceMonthlyModels() {
        return TransferredResourceMonthlyModels;
    }

    public void setTransferredResourceMonthlyModels(List<TransferredResourceModel> value) {
        TransferredResourceMonthlyModels = value;
    }

    private List<NoResourceVerificationModel> NoResourceVerificationModels = new ArrayList<>();

    public List<NoResourceVerificationModel> getNoResourceVerificationModels() {
        return NoResourceVerificationModels;
    }

    public void setNoResourceVerificationModels(List<NoResourceVerificationModel> value) {
        NoResourceVerificationModels = value;
    }

}
