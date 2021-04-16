package repository;

import entities.Courier;
import entities.Request;

import java.util.Collection;
import java.util.UUID;

public interface IRequestRepository {

    void addRequest(Request request);

    Request deleteRequest(UUID requestId);

    Request getRequest(UUID requestId);

    Collection<Request> getAll();
}
