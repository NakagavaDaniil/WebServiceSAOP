package com.epam.soapWS.ws;

import com.epam.soapWS.repository.CountryRepository;
import com.epam.soapWS.server.Country;
import com.epam.soapWS.server.GetCountryRequest;
import com.epam.soapWS.server.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://tutorialspoint/schemas";
    private CountryRepository countryRepository;

    @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        Country country = countryRepository.findCountry(request.getName());
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(country);
        return response;
    }
}
