package com.example.eCommerce.Service;

import com.example.eCommerce.Dto.RespondDto.SellerResponseDto;
import com.example.eCommerce.Dto.ReuestDto.SellerRequestDto;
import com.example.eCommerce.Exceptions.EmailAlreadyPresentException;
import com.example.eCommerce.Module.Seller;
import com.example.eCommerce.Repository.SellerRepository;
import com.example.eCommerce.Transform.SellerTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;
    public SellerResponseDto addSeller(SellerRequestDto sellerRequestDto) throws EmailAlreadyPresentException {

        if(sellerRepository.findByEmailId(sellerRequestDto.getEmailId())!=null)
            throw new EmailAlreadyPresentException("Email Id already registered");

        Seller seller = SellerTransform.sellerRequestDtoToSeller(sellerRequestDto);
        Seller savedSeller = sellerRepository.save(seller);

        SellerResponseDto sellerResponseDto = SellerTransform.sellerToSellerResponseDto(savedSeller);
        return sellerResponseDto;
    }
}
