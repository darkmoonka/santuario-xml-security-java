
/*
 * Copyright  1999-2004 The Apache Software Foundation.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.xml.security.signature;



/**
 * Raised when the computed hash value doesn't match the given <i>DigestValue</i>.  Additional human readable info is passed to the constructor -- this being the benefit of raising an exception or returning a value.
 *
 * @author Christian Geuer-Pollmann
 */
public class InvalidDigestValueException extends XMLSignatureException {

   /**
         * 
         */
        private static final long serialVersionUID = 1L;

   /**
    * Constructor InvalidDigestValueException
    *
    */
   public InvalidDigestValueException() {
      super();
   }

   /**
    * Constructor InvalidDigestValueException
    *
    * @param _msgID
    */
   public InvalidDigestValueException(String _msgID) {
      super(_msgID);
   }

   /**
    * Constructor InvalidDigestValueException
    *
    * @param _msgID
    * @param exArgs
    */
   public InvalidDigestValueException(String _msgID, Object exArgs[]) {
      super(_msgID, exArgs);
   }

   /**
    * Constructor InvalidDigestValueException
    *
    * @param _msgID
    * @param _originalException
    */
   public InvalidDigestValueException(String _msgID,
                                      Exception _originalException) {
      super(_msgID, _originalException);
   }

   /**
    * Constructor InvalidDigestValueException
    *
    * @param _msgID
    * @param exArgs
    * @param _originalException
    */
   public InvalidDigestValueException(String _msgID, Object exArgs[],
                                      Exception _originalException) {
      super(_msgID, exArgs, _originalException);
   }
}
