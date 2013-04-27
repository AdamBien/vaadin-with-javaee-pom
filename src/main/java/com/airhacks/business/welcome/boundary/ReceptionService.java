
package com.airhacks.business.welcome.boundary;

import javax.ejb.Stateless;

/**
 *
 * @author adam-bien.com
 */
@Stateless
public class ReceptionService {

    public String welcome() {
        return "Hello, Developer! No XML, No Configuration, and it works!";
    }
}
