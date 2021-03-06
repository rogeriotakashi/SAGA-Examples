package com.rogerio.saga.orchestrator.OrchestratorService.models.response.customer;


import com.rogerio.saga.orchestrator.OrchestratorService.enums.ReserveStatusEnum;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReserveCreditResponse {
	
	private Long orderId;
	private ReserveStatusEnum status;

	public ReserveCreditResponse(Long orderId,ReserveStatusEnum status) {
		this.orderId = orderId;
		this.status = status;
	}
	
	
}
