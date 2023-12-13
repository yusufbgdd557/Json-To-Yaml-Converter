package com.dev.yusuf.jsontoyamlconverter.business.concretes;

import com.dev.yusuf.jsontoyamlconverter.business.abstracts.ConverterService;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

@Service
public class ConverterManager implements ConverterService {
    @Override
    public String convertJsonToYaml(String jsonInput) {
        Yaml yaml = new Yaml();

        // Customize YAML formatting
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        yaml = new Yaml(options);

        // Convert JSON to YAML
        Object yamlOutput = yaml.load(jsonInput);

        // Return YAML as a string
        return yaml.dump(yamlOutput);

    }
}
