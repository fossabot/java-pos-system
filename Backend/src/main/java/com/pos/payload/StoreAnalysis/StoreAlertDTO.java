package com.pos.payload.StoreAnalysis;

import com.pos.payload.dto.BranchDTO;
import com.pos.payload.dto.ProductDTO;
import com.pos.payload.dto.RefundDTO;
import com.pos.payload.dto.UserDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class StoreAlertDTO {
    private List<ProductDTO> lowStockAlerts;
    private List<BranchDTO> noSalesToday;
    private List<RefundDTO> refundSpikeAlerts;
    private List<UserDTO> inactiveCashiers;
}

