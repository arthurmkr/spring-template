package blank;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public void helloWorld() {
        System.out.println("Hello World!");
    }
}
