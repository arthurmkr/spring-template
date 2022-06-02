package blank;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SomeServiceImpl implements SomeService {
    private final String param;

    @Override
    public String getParam() {
        return param;
    }
}
