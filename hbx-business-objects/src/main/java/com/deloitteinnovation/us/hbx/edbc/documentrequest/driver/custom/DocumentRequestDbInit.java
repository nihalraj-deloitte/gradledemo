package com.deloitteinnovation.us.hbx.edbc.documentrequest.driver.custom;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DocumentRequestDbInit {
    public List<DocumentRequestMasterModel> documentRequestMasterList;

    public List<DocumentRequestMasterModel> getDocumentRequestMasterList() {
        return documentRequestMasterList;
    }

    public void setDocumentRequestMasterList(List<DocumentRequestMasterModel> documentRequestMasterList) {
        this.documentRequestMasterList = documentRequestMasterList;
    }


}
