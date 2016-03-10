package com.google.common.geometry;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.linker.SingleScriptLinker;

public class CustomLinker extends SingleScriptLinker {
  @Override
  protected String getSelectionScriptTemplate(TreeLogger logger, LinkerContext context)
      throws UnableToCompleteException {
    return "com/google/common/geometry/SingleScriptTemplate.js";
  }
}