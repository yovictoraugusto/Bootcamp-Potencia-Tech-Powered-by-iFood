package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EnderecoRepository implements CrudRepository<Endereco, String> {
    @Override
    public <S extends Endereco> S save(S s) {
        return null;
    }

    @Override
    public <S extends Endereco> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Endereco> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<Endereco> findAll() {
        return null;
    }

    @Override
    public Iterable<Endereco> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Endereco endereco) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Endereco> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
