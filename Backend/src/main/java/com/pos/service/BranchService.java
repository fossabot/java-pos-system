package com.pos.service;


import com.pos.exception.ResourceNotFoundException;
import com.pos.exception.UserException;
import com.pos.modal.User;
import com.pos.payload.dto.BranchDTO;
import com.pos.payload.dto.UserDTO;

import java.util.List;

public interface BranchService {
    BranchDTO createBranch(BranchDTO branchDto, User user);
    BranchDTO getBranchById(Long id);
    List<BranchDTO> getAllBranchesByStoreId(Long storeId) throws UserException;
    BranchDTO updateBranch(Long id, BranchDTO branchDto, User user) throws Exception;

    void deleteBranch(Long id);
}

