package service.implementation;

import dto.RequestDto;
import entities.Request;
import mapper.RequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IRequestRepository;
import service.IRequestService;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService implements IRequestService {

    @Autowired
    IRequestRepository requestRepository;
    @Autowired
    RequestMapper requestMapper;

    @Override
    public List<RequestDto> getAllRequest() {
        List<Request> requests = requestRepository.findAll();
        return requestMapper.listRequestToListDto(requests);
    }

    @Override
    public void deleteAllRequest() {
        requestRepository.deleteAll();
    }

    @Override
    public RequestDto getRequestById(Long requestId) {
        Optional<Request> request = requestRepository.findById(requestId);
        return request.map(requestMapper::requestToDto).orElse(null);
    }

    @Override
    public RequestDto addRequest(RequestDto requestDto) {
        Request request = requestMapper.dtoToRequest(requestDto);
        request = requestRepository.save(request);
        return requestMapper.requestToDto(request);
    }

    @Override
    public void deleteRequestById(Long requestId) {
        requestRepository.deleteById(requestId);
    }
}
