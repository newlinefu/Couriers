package service;

import dto.RequestDto;

import java.util.List;

public interface IRequestService {

    List<RequestDto> getAllRequest();

    void deleteAllRequest();

    RequestDto getRequestById(Long requestId);

    RequestDto addRequest(RequestDto requestDto);

    void deleteRequestById(Long requestId);

}
