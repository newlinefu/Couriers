package repository;

import entities.Request;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RequestRepository implements IRequestRepository {

    private List<Request> requests = new ArrayList<Request>() {

    };

    @Override
    public void addRequest(Request request) {
        requests.add(request);
    }

    @Override
    public Request deleteRequest(UUID requestId) {
        Request deletedRequest = getRequest(requestId);
        requests.removeIf(r -> r.getRequestId().equals(requestId));

        return deletedRequest;
    }

    @Override
    public Request getRequest(UUID requestId) {
        Optional<Request> result = requests.stream().filter(r -> r.getRequestId().equals(requestId)).findFirst();
        return result.isEmpty() ? null : result.get();
    }

    @Override
    public Collection<Request> getAll() {
        return requests;
    }
}
