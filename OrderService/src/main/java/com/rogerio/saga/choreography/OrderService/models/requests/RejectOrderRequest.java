package com.rogerio.saga.choreography.OrderService.models.requests;


import com.rogerio.saga.choreography.OrderService.models.abstracts.AbstractOrder;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class RejectOrderRequest extends AbstractOrder{
	
	public RejectOrderRequest(Long id) {
		super(id);
	}
	
}
