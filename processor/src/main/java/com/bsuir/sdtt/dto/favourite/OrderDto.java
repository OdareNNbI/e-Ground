package com.bsuir.sdtt.dto.favourite;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * Class of Order Data Transfer Object. Used to transfer data between application subsystems.
 *
 * @author Stsiapan Balashenka
 * @version 1.0
 */
@Data
@Builder
@AllArgsConstructor
public class OrderDto {
    private UUID id;

    @NotNull
    private UUID customerId;

    @NotNull
    private String name;

    /**
     * Field of customer email.
     */
    @NotNull
    @Email
    private String email;

    /**
     * Field of order total price;
     */
    @NotNull
    @Min(0)
    private double totalPrice;

    /**
     * Field of order item count.
     */
    @NotNull
    @Min(0)
    private int orderItemCount;

    public OrderDto() {

    }
}
