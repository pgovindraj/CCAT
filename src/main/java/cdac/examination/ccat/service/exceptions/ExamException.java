/*
 * All content copyright (c) 2003-2009 Terracotta, Inc., except as may otherwise be noted in a separate copyright
 * notice. All rights reserved.
 */
package cdac.examination.ccat.service.exceptions;


public class ExamException extends Exception {

  public ExamException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public ExamException(final String message) {
    super(message);
  }

}
