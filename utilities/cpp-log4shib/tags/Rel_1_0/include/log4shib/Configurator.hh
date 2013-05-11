/*
 * Configurator.hh
 *
 * Copyright 2001, Glen Scott. All rights reserved.
 *
 * See the COPYING file for the terms of usage and distribution.
 */
#ifndef _LOG4SHIB_CONFIGURATOR_HH
#define _LOG4SHIB_CONFIGURATOR_HH

#include <log4shib/Portability.hh>
#include <log4shib/Export.hh>
#include <string>
#include <stdexcept>

namespace log4shib {

    /**
     * Exception class for configuration.
     */
    class LOG4SHIB_EXPORT ConfigureFailure : public std::runtime_error {
        public:
        /**
         * Constructor.
         * @param reason String containing the description of the exception.
         */
        ConfigureFailure(const std::string& reason);
    };
}

#endif // _LOG4SHIB_CONFIGURATOR_HH
