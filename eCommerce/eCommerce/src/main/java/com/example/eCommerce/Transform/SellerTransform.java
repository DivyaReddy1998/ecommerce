package com.example.eCommerce.Transform;

import com.example.eCommerce.Dto.RespondDto.SellerResponseDto;
import com.example.eCommerce.Dto.ReuestDto.SellerRequestDto;
import com.example.eCommerce.Module.Seller;
import lombok.Builder;

@Builder
public class SellerTransform {
    public static Seller sellerRequestDtoToSeller(SellerRequestDto sellerRequestDto){

        return Seller.builder()
                .name(sellerRequestDto.getName())
                .age(sellerRequestDto.getAge())
                .emailId(sellerRequestDto.getEmailId())
                .mobNo(sellerRequestDto.getMobNo())
                .build();
    }
    public static SellerResponseDto sellerToSellerResponseDto(Seller seller){
        return SellerResponseDto.builder()
                .name(seller.getName())
                .age(seller.getAge())
                .build();
    }
}
