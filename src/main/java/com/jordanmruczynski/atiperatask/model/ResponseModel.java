package com.jordanmruczynski.atiperatask.model;

import java.util.List;

public record ResponseModel(
        String repositoryName,
        String ownerLogin,
        List<BranchInfo> branches) {
}
