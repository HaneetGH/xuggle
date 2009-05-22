/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * Specifies format information than can be used to configure  
 * an {@link IContainer} for input or output.  
 * <p>  
 * Often times XUGGLER can guess the correct formats to put into  
 * a given IContainer object, but sometimes it needs help. You  
 * can allocate an IContainerFormat object and specify information about 
 *  
 * input or output containers, and then pass this to IContainer.open(...) 
 *  
 * to help us guess.  
 * </p>  
 */
public class IContainerFormat extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  protected IContainerFormat(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIContainerFormatUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IContainerFormat obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IContainerFormat object that is actually referring to the
   * exact same underlying native object.
   *
   * This method increases the ref count of the underlying Native object.
   *
   * @return the new Java object.
   */
  public IContainerFormat copyReference() {
    if (swigCPtr == 0)
      return null;
    else
    {
      IContainerFormat retval = new IContainerFormat(swigCPtr, false);
      retval.acquire();
      return retval;
    }
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IContainerFormat)
      equal = (((IContainerFormat)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  /**
   * Releases any underlying native memory and marks this object
   * as invalid.
   * <p>
   * Normally Ferry manages when to release native memory.
   * </p>
   * <p>
   * In the unlikely event you want to control EXACTLY when a native 
   * object is released, each Xuggler object has a {@link #delete()}
   * method that you can use. Once you call {@link #delete()},
   * you must ENSURE your object is never referenced again from
   * that Java object -- Ferry tries to help you avoid crashes if you
   * accidentally use an object after deletion but on this but we
   * cannot offer 100% protection (specifically if another thread
   *  is accessing that object EXACTLY when you {@link #delete()} it). 
   * </p>
   */
  

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
    super.delete();
  }


  /**
   * info about this format object
   * @return information about this object
   */
   
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    if (isInput())
    {
      result.append("iname:"+getInputFormatShortName()+";");
      result.append("ilongname:"+getInputFormatLongName()+";");
    }
    if (isOutput())
    {
      result.append("oname:"+getOutputFormatShortName()+";");
      result.append("olongname:"+getOutputFormatLongName()+";");
      result.append("omimetype:"+getOutputFormatMimeType()+";");
      result.append("oextensions:"+getOutputExtensions()+";");
    }
    result.append("]");
    return result.toString();
  }
  
  /**
   * Returns a list of all codecs supported for this Object.
   *
   * <p>
   *
   * If this object hasn't been set up for output, then
   * we return null.
   *
   * </p>
   *
   * @return A list of supported codecs, in decreasing
   *   order of the IContainerFormat Object's preference.
   *
   */
   
  public java.util.List<ICodec.ID> getOutputCodecsSupported()
  {
    java.util.List<ICodec.ID> retval =
      new java.util.LinkedList<ICodec.ID>();
    
    int numCodecs = getOutputNumCodecsSupported();
    for(int i = 0; i < numCodecs; i++)
    {
      ICodec.ID id = getOutputCodecID(i);
      if (id != ICodec.ID.CODEC_ID_NONE)
        retval.add(id);
    }    
    return retval;
  }
  
    /**
   * Return a collection of all input formats installed on this system.
   * @return the list.
   */
  public static java.util.Collection<IContainerFormat>
  getInstalledInputFormats()
  {
    java.util.Collection<IContainerFormat> retval =
      new java.util.HashSet<IContainerFormat>();
    int count = getNumInstalledInputFormats();
    for(int i = 0; i< count;++i)
    {
      IContainerFormat fmt = getInstalledInputFormat(i);
      if (fmt != null)
        retval.add(fmt);
    }
    return retval;
  }
  
  /**
   * Return a collection of all output formats installed on this system.
   * @return the list.
   */
  public static java.util.Collection<IContainerFormat>
  getInstalledOutputFormats()
  {
    java.util.Collection<IContainerFormat> retval =
      new java.util.HashSet<IContainerFormat>();
    int count = getNumInstalledOutputFormats();
    for(int i = 0; i< count;++i)
    {
      IContainerFormat fmt = getInstalledOutputFormat(i);
      if (fmt != null)
        retval.add(fmt);
    }
    return retval;
  }

/**
 * Sets the input format for this container.  
 * @param	shortName The short name for this container (using FFMPEG's 
 *		  
 * short name).  
 * @return	>= 0 on success. < 0 if shortName cannot be found.  
 */
  public int setInputFormat(String shortName) {
    return XugglerJNI.IContainerFormat_setInputFormat(swigCPtr, this, shortName);
  }

/**
 * Sets the output format for this container.  
 * We'll look at the shortName, url and mimeType and try to guess  
 * a valid output container format.  
 * @param	shortName The short name for this container (using FFMPEG's 
 *		  
 * short name).  
 * @param	url The URL for this container.  
 * @param	mimeType The mime type for this container.  
 * @return	>= 0 on success. < 0 if we cannot find a good container. 
 *		  
 */
  public int setOutputFormat(String shortName, String url, String mimeType) {
    return XugglerJNI.IContainerFormat_setOutputFormat(swigCPtr, this, shortName, url, mimeType);
  }

/**
 * Get the short name for the input format.  
 * @return	The short name for the input format, or null if none.  
 */
  public String getInputFormatShortName() {
    return XugglerJNI.IContainerFormat_getInputFormatShortName(swigCPtr, this);
  }

/**
 * Get the long name for the input format.  
 * @return	The long name for the input format, or null if none.  
 */
  public String getInputFormatLongName() {
    return XugglerJNI.IContainerFormat_getInputFormatLongName(swigCPtr, this);
  }

/**
 * Get the short name for the output format.  
 * @return	The short name for the output format, or null if none.  
 */
  public String getOutputFormatShortName() {
    return XugglerJNI.IContainerFormat_getOutputFormatShortName(swigCPtr, this);
  }

/**
 * Get the long name for the output format.  
 * @return	The long name for the output format, or null if none.  
 */
  public String getOutputFormatLongName() {
    return XugglerJNI.IContainerFormat_getOutputFormatLongName(swigCPtr, this);
  }

/**
 * Get the mime type for the output format.  
 * @return	The mime type for the output format, or null if none.  
 */
  public String getOutputFormatMimeType() {
    return XugglerJNI.IContainerFormat_getOutputFormatMimeType(swigCPtr, this);
  }

/**
 * Create a new IContainerFormat object.  
 * @return	a new object, or null on error.  
 */
  public static IContainerFormat make() {
    long cPtr = XugglerJNI.IContainerFormat_make();
    return (cPtr == 0) ? null : new IContainerFormat(cPtr, false);
  }

/**
 * Get the input flags associated with this object.  
 * @return	The (compacted) value of all flags set.  
 */
  public int getInputFlags() {
    return XugglerJNI.IContainerFormat_getInputFlags(swigCPtr, this);
  }

/**
 * Set the input flags to use with this object. All values  
 * must be ORed (|) together.  
 * @see		Flags  
 * @param	newFlags The new set flags for this codec.  
 */
  public void setInputFlags(int newFlags) {
    XugglerJNI.IContainerFormat_setInputFlags(swigCPtr, this, newFlags);
  }

/**
 * Get the input setting for the specified flag  
 * @param	flag The flag you want to find the setting for  
 * @return	0 for false; non-zero for true  
 */
  public boolean getInputFlag(IContainerFormat.Flags flag) {
    return XugglerJNI.IContainerFormat_getInputFlag(swigCPtr, this, flag.swigValue());
  }

/**
 * Set the input flag.  
 * @param	flag The flag to set  
 * @param	value The value to set it to (true or false)  
 */
  public void setInputFlag(IContainerFormat.Flags flag, boolean value) {
    XugglerJNI.IContainerFormat_setInputFlag(swigCPtr, this, flag.swigValue(), value);
  }

/**
 * Get the output flags associated with this object.  
 * @return	The (compacted) value of all flags set.  
 */
  public int getOutputFlags() {
    return XugglerJNI.IContainerFormat_getOutputFlags(swigCPtr, this);
  }

/**
 * Set the output flags to use with this object. All values  
 * must be ORed (|) together.  
 * @see		Flags  
 * @param	newFlags The new set flags for this codec.  
 */
  public void setOutputFlags(int newFlags) {
    XugglerJNI.IContainerFormat_setOutputFlags(swigCPtr, this, newFlags);
  }

/**
 * Get the output setting for the specified flag  
 * @param	flag The flag you want to find the setting for  
 * @return	0 for false; non-zero for true  
 */
  public boolean getOutputFlag(IContainerFormat.Flags flag) {
    return XugglerJNI.IContainerFormat_getOutputFlag(swigCPtr, this, flag.swigValue());
  }

/**
 * Set the output flag.  
 * @param	flag The flag to set  
 * @param	value The value to set it to (true or false)  
 */
  public void setOutputFlag(IContainerFormat.Flags flag, boolean value) {
    XugglerJNI.IContainerFormat_setOutputFlag(swigCPtr, this, flag.swigValue(), value);
  }

/**
 * Is this an output container format?  
 * @return	true if output; false it not  
 */
  public boolean isOutput() {
    return XugglerJNI.IContainerFormat_isOutput(swigCPtr, this);
  }

/**
 * Is this an input container format?  
 * @return	true if input; false it not  
 */
  public boolean isInput() {
    return XugglerJNI.IContainerFormat_isInput(swigCPtr, this);
  }

/**
 * Get the filename extensions that this output format prefers  
 * (most common first).  
 * @return	a command separated string of output extensions, or  
 * null if none.  
 */
  public String getOutputExtensions() {
    return XugglerJNI.IContainerFormat_getOutputExtensions(swigCPtr, this);
  }

/**
 * Get the default audio codec this container prefers, if known.  
 * @return	the default audio codec id, or {@link ICodec.ID#CODEC_ID_NONE} 
 *		  
 * if unknown.  
 */
  public ICodec.ID getOutputDefaultAudioCodec() {
    return ICodec.ID.swigToEnum(XugglerJNI.IContainerFormat_getOutputDefaultAudioCodec(swigCPtr, this));
  }

/**
 * Get the default video codec this container prefers, if known.  
 * @return	the default video codec id, or {@link ICodec.ID#CODEC_ID_NONE} 
 *		  
 * if unknown.  
 */
  public ICodec.ID getOutputDefaultVideoCodec() {
    return ICodec.ID.swigToEnum(XugglerJNI.IContainerFormat_getOutputDefaultVideoCodec(swigCPtr, this));
  }

/**
 * Get the default subtitle codec this container prefers, if known. 
 *  
 * @return	the default subtitle codec id, or {@link ICodec.ID#CODEC_ID_NONE} 
 *		  
 * if unknown.  
 */
  public ICodec.ID getOutputDefaultSubtitleCodec() {
    return ICodec.ID.swigToEnum(XugglerJNI.IContainerFormat_getOutputDefaultSubtitleCodec(swigCPtr, this));
  }

/**
 * Gets the number of different codecs this container  
 * can include for encoding.  
 * This can be used as an upper bound when using the  
 * {@link #getOutputCodecID(int)} and  
 * {@link #getOutputCodecTag(int)}  
 * methods to dynamically query the actual codecs.  
 * @return	The total number of different codec types that can  
 * be encoded into this container format.  
 */
  public int getOutputNumCodecsSupported() {
    return XugglerJNI.IContainerFormat_getOutputNumCodecsSupported(swigCPtr, this);
  }

/**
 * Queries for a supported codec id from the list of codecs  
 * that can be encoded into this ContainerFormat.  
 * @param	index The index in our lookup table. Index >= 0 and  
 * < {@link #getOutputNumCodecsSupported()}. Index values may  
 * change between releases, so always query.  
 * @return	The codec id at this position, or  
 * {@link ICodec.ID#CODEC_ID_NONE}  
 * if there is none.  
 */
  public ICodec.ID getOutputCodecID(int index) {
    return ICodec.ID.swigToEnum(XugglerJNI.IContainerFormat_getOutputCodecID(swigCPtr, this, index));
  }

/**
 * Queries for a supported codec tag from the list of codecs  
 * that can be encoded into this ContainerFormat.  
 * <p>  
 * Tags are 4-byte values that are often used as markers  
 * in a container format for a codec type.  
 * </p>  
 * @param	index The index in our lookup table. Index >= 0 and  
 * < {@link #getOutputNumCodecsSupported()}. Index values may  
 * change between releases, so always query.  
 * @return	The codec id tag this position, or 0 if there is none.  
 */
  public int getOutputCodecTag(int index) {
    return XugglerJNI.IContainerFormat_getOutputCodecTag__SWIG_0(swigCPtr, this, index);
  }

/**
 * Get the 4-byte tag the container would output for  
 * the given codec id.  
 * @param	id the codec you are about  
 * @return	the 4-byte codec tag, or 0 if that id is not  
 * supported.  
 */
  public int getOutputCodecTag(ICodec.ID id) {
    return XugglerJNI.IContainerFormat_getOutputCodecTag__SWIG_1(swigCPtr, this, id.swigValue());
  }

/**
 * Returns true if this container format can output media  
 * encoded with the given codec.  
 * @param	id the codec you care about.  
 * @return	true if the codec can be put in this output container;  
 * false otherwise.  
 */
  public boolean isCodecSupportedForOutput(ICodec.ID id) {
    return XugglerJNI.IContainerFormat_isCodecSupportedForOutput(swigCPtr, this, id.swigValue());
  }

/**
 * Get the number of input formats this install can demultiplex (read) 
 *  
 * from.  
 * @return	the number of formats  
 */
  public static int getNumInstalledInputFormats() {
    return XugglerJNI.IContainerFormat_getNumInstalledInputFormats();
  }

/**
 * Return an object for the input format at the given index.  
 * @param	index an index for the input format list we maintain  
 * @return	a format object for that input or null if  
 * unknown, index < 0 or index >= {@link #getNumInstalledInputFormats()} 
 *  
 */
  public static IContainerFormat getInstalledInputFormat(int index) {
    long cPtr = XugglerJNI.IContainerFormat_getInstalledInputFormat(index);
    return (cPtr == 0) ? null : new IContainerFormat(cPtr, false);
  }

/**
 * Get the number of output formats this install can multiplex  
 * (write) to.  
 * @return	the number of formats  
 */
  public static int getNumInstalledOutputFormats() {
    return XugglerJNI.IContainerFormat_getNumInstalledOutputFormats();
  }

/**
 * Return an object for the output format at the given index.  
 * @param	index an index for the output format list we maintain  
 * @return	a format object for that output or null if  
 * unknown, index < 0 or index >= {@link #getNumInstalledOutputFormats()} 
 *  
 */
  public static IContainerFormat getInstalledOutputFormat(int index) {
    long cPtr = XugglerJNI.IContainerFormat_getInstalledOutputFormat(index);
    return (cPtr == 0) ? null : new IContainerFormat(cPtr, false);
  }

  public enum Flags {
    FLAG_NOFILE(XugglerJNI.IContainerFormat_FLAG_NOFILE_get()),
    FLAG_NEEDNUMBER(XugglerJNI.IContainerFormat_FLAG_NEEDNUMBER_get()),
    FLAG_SHOW_IDS(XugglerJNI.IContainerFormat_FLAG_SHOW_IDS_get()),
    FLAG_RAWPICTURE(XugglerJNI.IContainerFormat_FLAG_RAWPICTURE_get()),
    FLAG_GLOBALHEADER(XugglerJNI.IContainerFormat_FLAG_GLOBALHEADER_get()),
    FLAG_NOTIMESTAMPS(XugglerJNI.IContainerFormat_FLAG_NOTIMESTAMPS_get()),
    FLAG_GENERIC_INDEX(XugglerJNI.IContainerFormat_FLAG_GENERIC_INDEX_get()),
    FLAG_TS_DISCONT(XugglerJNI.IContainerFormat_FLAG_TS_DISCONT_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Flags swigToEnum(int swigValue) {
      Flags[] swigValues = Flags.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Flags swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Flags.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Flags() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Flags(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Flags(Flags swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
