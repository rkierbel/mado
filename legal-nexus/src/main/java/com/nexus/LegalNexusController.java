package com.nexus;

import io.micronaut.http.annotation.*;

@Controller("/legal-nexus")
public class LegalNexusController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response";
    }
}