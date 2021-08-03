package com.example.fourth.card;

import org.springframework.stereotype.Service;

@Service
public interface CreCardService {

	String getCardType(long cardNo);

}
