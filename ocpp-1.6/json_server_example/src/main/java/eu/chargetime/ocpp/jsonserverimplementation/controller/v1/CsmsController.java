package eu.chargetime.ocpp.jsonserverimplementation.controller.v1;

import eu.chargetime.ocpp.jsonserverimplementation.service.EVService;
import eu.chargetime.ocpp.model.core.GetConfigurationConfirmation;
import eu.chargetime.ocpp.model.core.ResetConfirmation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/csms/")
@RequiredArgsConstructor
@Slf4j
public class CsmsController {
    private final EVService evService;

    @GetMapping("activate")
    public void activate() {
        log.info("Retrieve activate request from iEnergy CSMS !");
        evService.activate();
    }

    @GetMapping("deactivate")
    public void deactivate() {
        log.info("Retrieve deactivate request from iEnergy CSMS !");
        evService.deactivate();
    }

    @GetMapping("reset/{sessionId}")
    public ResetConfirmation reset(@PathVariable String sessionId) {
        log.info("Reset request from iEnergy CSMS !");
        return evService.reset(sessionId);
    }

    @GetMapping("getConfiguration/{sessionId}")
    public GetConfigurationConfirmation getConfiguration(@PathVariable String sessionId) {
        log.info("GetConfiguration request from iEnergy CSMS !");
        return evService.getConfiguration(sessionId);
    }
}