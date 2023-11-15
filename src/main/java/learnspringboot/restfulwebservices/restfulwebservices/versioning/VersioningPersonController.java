package learnspringboot.restfulwebservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    @GetMapping("/v1/person") //URI versioning (Twitter example)
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Tom Lo");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson(){
        return new PersonV2(new Name("Tom", "Lo"));
    }

    @GetMapping(path = "/person", params = "version=1") //Request Parameter versioning (Amazon example)
    public PersonV1 getFirstVersionOfPersonRequestParameter(){
        return new PersonV1("Tom Lo");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParameter(){
        return new PersonV2(new Name("Tom", "Lo"));
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1") //(Custom) Headers versioning (Microsoft example)
    public PersonV1 getFirstVersionOfPersonRequestHeader(){
        return new PersonV1("Tom Lo");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader(){
        return new PersonV2(new Name("Tom", "Lo"));
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json") //"Content Negotiation" or "Accept Header" (GitHub example)
    public PersonV1 getFirstVersionOfPersonAcceptHeader(){
        return new PersonV1("Tom Lo");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfPersonAcceptHeader(){
        return new PersonV2(new Name("Tom", "Lo"));
    }
}
