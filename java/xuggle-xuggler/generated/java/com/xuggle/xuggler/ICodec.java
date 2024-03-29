/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * A "key" to an {@link IStreamCoder} that tells it how to encode or 
 * decode data.  
 * Use these objects to tell a IStreamCoder you want to use MP3 or NellyMoser 
 *  
 * for example.  
 */
public class ICodec extends RefCounted {
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

  /**
   * Internal Only.
   */
  protected ICodec(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGICodecUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected ICodec(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(XugglerJNI.SWIGICodecUpcast(cPtr),
     cMemoryOwn, ref);
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
  public static long getCPtr(ICodec obj) {
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
   * Create a new ICodec object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public ICodec copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new ICodec(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof ICodec)
      equal = (((ICodec)obj).swigCPtr == this.swigCPtr);
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
   * Prints the type and id of this codec
   * @return the type and id
   */
   
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    result.append("type="+getType()+";");
    result.append("id="+getID()+";");
    result.append("name="+getName()+";");
    result.append("]");
    return result.toString();
  }

  /**
   * Gets a collection of ALL codecs installed on this
   * system. 
   * 
   * @return A collection of all installed codecs.
   */

  public static java.util.Collection<ICodec>
  getInstalledCodecs()
  {
    java.util.Collection<ICodec> retval = new java.util.HashSet<ICodec>();
    int count = getNumInstalledCodecs();
    for(int i=0;i<count;i++)
    {
      ICodec codec = getInstalledCodec(i);
      if (codec != null)
        retval.add(codec);
    }
    return retval;
  }

  /**
   * Returns a list of supported frame-rates this codec can encode
   * video to.
   * 
   * <p>
   * 
   * Not all codecs support reporting this, in which case the returned list
   * will be empty.
   * 
   * </p>
   * 
   * @return a list
   */

  public java.util.List<IRational>
  getSupportedVideoFrameRates()
  {
    java.util.List<IRational> retval =
      new java.util.LinkedList<IRational>();
    int count = getNumSupportedVideoFrameRates();
    for(int i=0;i<count;i++)
    {
      IRational rate = getSupportedVideoFrameRate(i);
      if (rate != null)
        retval.add(rate);
    }
    return retval;
  }

  /**
   * Returns a list of supported pixel formats this codec can encode
   * video in.
   * 
   * <p>
   * 
   * Not all codecs support reporting this, in which case the returned list
   * will be empty.
   * 
   * </p>
   * 
   * @return a list
   */

  public java.util.List<IPixelFormat.Type>
  getSupportedVideoPixelFormats()
  {
    java.util.List<IPixelFormat.Type> retval =
      new java.util.LinkedList<IPixelFormat.Type>();
    int count = getNumSupportedVideoPixelFormats();
    for(int i=0;i<count;i++)
    {
      IPixelFormat.Type type = getSupportedVideoPixelFormat(i);
      if (type != null && type != IPixelFormat.Type.NONE)
        retval.add(type);
    }
    return retval;
  }

  /**
   * Returns a list of supported audio sample rates this codec can encode
   * audio in.
   * 
   * <p>
   * 
   * Not all codecs support reporting this, in which case the returned list
   * will be empty.
   * 
   * </p>
   * 
   * @return a list
   */

  public java.util.List<Integer>
  getSupportedAudioSampleRates()
  {
    java.util.List<Integer> retval =
      new java.util.LinkedList<Integer>();
    int count = getNumSupportedAudioSampleRates();
    for(int i=0;i<count;i++)
    {
      int rate = getSupportedAudioSampleRate(i);
      if (rate != 0)
        retval.add(rate);
    }
    return retval;
  }

  /**
   * Returns a list of supported audio sample formats this codec can encode
   * audio in.
   * 
   * <p>
   * 
   * Not all codecs support reporting this, in which case the returned list
   * will be empty.
   * 
   * </p>
   * 
   * @return a list
   */

  public java.util.List<IAudioSamples.Format>
  getSupportedAudioSampleFormats()
  {
    java.util.List<IAudioSamples.Format> retval =
      new java.util.LinkedList<IAudioSamples.Format>();
    int count = getNumSupportedAudioSampleFormats();
    for(int i=0;i<count;i++)
    {
      IAudioSamples.Format fmt = getSupportedAudioSampleFormat(i);
      if (fmt != null && fmt != IAudioSamples.Format.FMT_NONE)
        retval.add(fmt);
    }
    return retval;
  }

  /**
   * Returns a list of supported audio channel layouts this codec can encode
   * audio in.
   * 
   * <p>
   * 
   * Not all codecs support reporting this, in which case the returned list
   * will be empty.
   * 
   * </p>
   * 
   * @return a list
   */

  public java.util.List<Long>
  getSupportedAudioChannelLayouts()
  {
    java.util.List<Long> retval =
      new java.util.LinkedList<Long>();
    int count = getNumSupportedAudioChannelLayouts();
    for(int i=0;i<count;i++)
    {
      long layout = getSupportedAudioChannelLayout(i);
      if (layout != 0)
        retval.add(layout);
    }
    return retval;
  }


/**
 * Get the name of the codec.  
 * @return	The name of this Codec.  
 */
  public String getName() {
    return XugglerJNI.ICodec_getName(swigCPtr, this);
  }

/**
 * Get the ID of this codec, as an integer.  
 * @return	the ID of this codec, as an integer.  
 */
  public int getIDAsInt() {
    return XugglerJNI.ICodec_getIDAsInt(swigCPtr, this);
  }

/**
 * Get the ID of this codec as an enumeration.  
 * @return	the ID of this codec, an enum ID  
 */
  public ICodec.ID getID() {
    return ICodec.ID.swigToEnum(XugglerJNI.ICodec_getID(swigCPtr, this));
  }

/**
 * Get the type of this codec.  
 * @return	The type of this Codec, as a enum Type  
 */
  public ICodec.Type getType() {
    return ICodec.Type.swigToEnum(XugglerJNI.ICodec_getType(swigCPtr, this));
  }

/**
 * Can this codec be used for decoding?  
 * @return	Can this Codec decode?  
 */
  public boolean canDecode() {
    return XugglerJNI.ICodec_canDecode(swigCPtr, this);
  }

/**
 * Can this codec be used for encoding?  
 * @return	Can this Codec encode?  
 */
  public boolean canEncode() {
    return XugglerJNI.ICodec_canEncode(swigCPtr, this);
  }

/**
 * Find a codec that can be used for encoding.  
 * @param	id The id of the codec  
 * @return	the codec, or null if we can't find it.  
 */
  public static ICodec findEncodingCodec(ICodec.ID id) {
    long cPtr = XugglerJNI.ICodec_findEncodingCodec(id.swigValue());
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

/**
 * Find a codec that can be used for encoding.  
 * @param	id The id of the codec, as an integer.  
 * @return	the codec, or null if we can't find it.  
 */
  public static ICodec findEncodingCodecByIntID(int id) {
    long cPtr = XugglerJNI.ICodec_findEncodingCodecByIntID(id);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

/**
 * Find a codec that can be used for encoding.  
 * @param	id The id of the codec, as a FFMPEG short-name string  
 * (for example, "mpeg4").  
 * @return	the codec, or null if we can't find it.  
 */
  public static ICodec findEncodingCodecByName(String id) {
    long cPtr = XugglerJNI.ICodec_findEncodingCodecByName(id);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

/**
 * Find a codec that can be used for decoding.  
 * @param	id The id of the codec  
 * @return	the codec, or null if we can't find it.  
 */
  public static ICodec findDecodingCodec(ICodec.ID id) {
    long cPtr = XugglerJNI.ICodec_findDecodingCodec(id.swigValue());
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

/**
 * Find a codec that can be used for decoding.  
 * @param	id The id of the codec, as an integer  
 * @return	the codec, or null if we can't find it.  
 */
  public static ICodec findDecodingCodecByIntID(int id) {
    long cPtr = XugglerJNI.ICodec_findDecodingCodecByIntID(id);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

/**
 * Find a codec that can be used for decoding.  
 * @param	id The id of the codec, as a FFMPEG short-name string  
 * (for example, "mpeg4")  
 * @return	the codec, or null if we can't find it.  
 */
  public static ICodec findDecodingCodecByName(String id) {
    long cPtr = XugglerJNI.ICodec_findDecodingCodecByName(id);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

/**
 * Ask us to guess an encoding codec based on the inputs  
 * passed in.  
 * <p>  
 * You must pass in at least one non null fmt, shortName,  
 * url or mime_type.  
 * </p>  
 * @param	fmt An IContainerFormat for the container you'll want to encode 
 *		 into.  
 * @param	shortName The FFMPEG short name of the codec (e.g. "mpeg4"). 
 *		  
 * @param	url The URL you'll be writing packets to.  
 * @param	mimeType The mime type of the container.  
 * @param	type The codec type.  
 * @return	the codec, or null if we can't find it.  
 */
  public static ICodec guessEncodingCodec(IContainerFormat fmt, String shortName, String url, String mimeType, ICodec.Type type) {
    long cPtr = XugglerJNI.ICodec_guessEncodingCodec(IContainerFormat.getCPtr(fmt), fmt, shortName, url, mimeType, type.swigValue());
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

/**
 * Get the long name for this codec.  
 * @return	the long name.  
 */
  public String getLongName() {
    return XugglerJNI.ICodec_getLongName(swigCPtr, this);
  }

/**
 * Get the capabilites flag from the codec  
 * @return	the capabilities flag  
 */
  public int getCapabilities() {
    return XugglerJNI.ICodec_getCapabilities(swigCPtr, this);
  }

/**
 * Convenience method to check individual capability flags.  
 * @param	capability the capability  
 * @return	true if flag is set; false otherwise.  
 */
  public boolean hasCapability(ICodec.Capabilities capability) {
    return XugglerJNI.ICodec_hasCapability(swigCPtr, this, capability.swigValue());
  }

/**
 * Get the number of installed codecs on this system.  
 * @return	the number of installed codecs.  
 */
  public static int getNumInstalledCodecs() {
    return XugglerJNI.ICodec_getNumInstalledCodecs();
  }

/**
 * Get the {@link ICodec} at the given index.  
 * @param	index the index in our list  
 * @return	the codec, or null if index < 0 or index >=  
 * {@link #getNumInstalledCodecs()}  
 */
  public static ICodec getInstalledCodec(int index) {
    long cPtr = XugglerJNI.ICodec_getInstalledCodec(index);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

/**
 *  
 * Not all codecs will report this number.  
 * @return	the number or 0 if we don't know.  
 */
  public int getNumSupportedVideoFrameRates() {
    return XugglerJNI.ICodec_getNumSupportedVideoFrameRates(swigCPtr, this);
  }

/**
 * Return the supported frame rate at the given index.  
 * @param	index the index in our list.  
 * @return	the frame rate, or null if unknown, if index <0 or  
 * if index >= {@link #getNumSupportedVideoFrameRates()}  
 */
  public IRational getSupportedVideoFrameRate(int index) {
    long cPtr = XugglerJNI.ICodec_getSupportedVideoFrameRate(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Get the number of supported video pixel formats this codec supports 
 *  
 * for encoding. Not all codecs will report this.  
 * @return	the number or 0 if we don't know.  
 */
  public int getNumSupportedVideoPixelFormats() {
    return XugglerJNI.ICodec_getNumSupportedVideoPixelFormats(swigCPtr, this);
  }

/**
 * Return the supported video pixel format at the given index.  
 * @param	index the index in our list.  
 * @return	the pixel format, or {@link IPixelFormat.Type#NONE} if unknown, 
 *		  
 * if index <0 or  
 * if index >= {@link #getNumSupportedVideoPixelFormats()}  
 */
  public IPixelFormat.Type getSupportedVideoPixelFormat(int index) {
    return IPixelFormat.Type.swigToEnum(XugglerJNI.ICodec_getSupportedVideoPixelFormat(swigCPtr, this, index));
  }

/**
 * Get the number of different audio sample rates this codec supports 
 *  
 * for encoding. Not all codecs will report this.  
 * @return	the number or 0 if we don't know.  
 */
  public int getNumSupportedAudioSampleRates() {
    return XugglerJNI.ICodec_getNumSupportedAudioSampleRates(swigCPtr, this);
  }

/**
 * Return the support audio sample rate at the given index.  
 * @param	index the index in our list.  
 * @return	the sample rate, or 0 if unknown, index < 0 or  
 * index >= {@link #getNumSupportedAudioSampleRates()}  
 */
  public int getSupportedAudioSampleRate(int index) {
    return XugglerJNI.ICodec_getSupportedAudioSampleRate(swigCPtr, this, index);
  }

/**
 * Get the number of different audio sample formats this codec supports 
 *  
 * for encoding. Not all codecs will report this.  
 * @return	the number or 0 if we don't know.  
 */
  public int getNumSupportedAudioSampleFormats() {
    return XugglerJNI.ICodec_getNumSupportedAudioSampleFormats(swigCPtr, this);
  }

/**
 * Get the supported sample format at this index.  
 * @param	index the index in our list.  
 *  
 * unknown, index < 0 or index >=  
 * {@link #getNumSupportedAudioSampleFormats()}.  
 */
  public IAudioSamples.Format getSupportedAudioSampleFormat(int index) {
    return IAudioSamples.Format.swigToEnum(XugglerJNI.ICodec_getSupportedAudioSampleFormat(swigCPtr, this, index));
  }

/**
 * Get the number of different audio channel layouts this codec supports 
 *  
 * for encoding. Not all codecs will report this.  
 * @return	the number or 0 if we don't know.  
 */
  public int getNumSupportedAudioChannelLayouts() {
    return XugglerJNI.ICodec_getNumSupportedAudioChannelLayouts(swigCPtr, this);
  }

/**
 * Get the supported audio channel layout at this index.  
 * The value returned is a bit flag representing the different  
 * types of audio layout this codec can support. Test the values  
 * by bit-comparing them to the {@link IAudioSamples.ChannelLayout} 
 *  
 * enum types.  
 * @param	index the index  
 * @return	the channel layout, or 0 if unknown, index < 0 or  
 * index >= {@link #getNumSupportedAudioChannelLayouts}.  
 */
  public long getSupportedAudioChannelLayout(int index) {
    return XugglerJNI.ICodec_getSupportedAudioChannelLayout(swigCPtr, this, index);
  }

  public enum ID {
  /**
   * These are the codecs this library currently supports.
   * These are based on FFMPEG Git versions later than this:
   * 391a1327bd076c25c2b2509ab7ae0081c443b94e
   */
    CODEC_ID_NONE,
    CODEC_ID_MPEG1VIDEO,
    CODEC_ID_MPEG2VIDEO,
    CODEC_ID_MPEG2VIDEO_XVMC,
    CODEC_ID_H261,
    CODEC_ID_H263,
    CODEC_ID_RV10,
    CODEC_ID_RV20,
    CODEC_ID_MJPEG,
    CODEC_ID_MJPEGB,
    CODEC_ID_LJPEG,
    CODEC_ID_SP5X,
    CODEC_ID_JPEGLS,
    CODEC_ID_MPEG4,
    CODEC_ID_RAWVIDEO,
    CODEC_ID_MSMPEG4V1,
    CODEC_ID_MSMPEG4V2,
    CODEC_ID_MSMPEG4V3,
    CODEC_ID_WMV1,
    CODEC_ID_WMV2,
    CODEC_ID_H263P,
    CODEC_ID_H263I,
    CODEC_ID_FLV1,
    CODEC_ID_SVQ1,
    CODEC_ID_SVQ3,
    CODEC_ID_DVVIDEO,
    CODEC_ID_HUFFYUV,
    CODEC_ID_CYUV,
    CODEC_ID_H264,
    CODEC_ID_INDEO3,
    CODEC_ID_VP3,
    CODEC_ID_THEORA,
    CODEC_ID_ASV1,
    CODEC_ID_ASV2,
    CODEC_ID_FFV1,
    CODEC_ID_4XM,
    CODEC_ID_VCR1,
    CODEC_ID_CLJR,
    CODEC_ID_MDEC,
    CODEC_ID_ROQ,
    CODEC_ID_INTERPLAY_VIDEO,
    CODEC_ID_XAN_WC3,
    CODEC_ID_XAN_WC4,
    CODEC_ID_RPZA,
    CODEC_ID_CINEPAK,
    CODEC_ID_WS_VQA,
    CODEC_ID_MSRLE,
    CODEC_ID_MSVIDEO1,
    CODEC_ID_IDCIN,
    CODEC_ID_8BPS,
    CODEC_ID_SMC,
    CODEC_ID_FLIC,
    CODEC_ID_TRUEMOTION1,
    CODEC_ID_VMDVIDEO,
    CODEC_ID_MSZH,
    CODEC_ID_ZLIB,
    CODEC_ID_QTRLE,
    CODEC_ID_SNOW,
    CODEC_ID_TSCC,
    CODEC_ID_ULTI,
    CODEC_ID_QDRAW,
    CODEC_ID_VIXL,
    CODEC_ID_QPEG,
    CODEC_ID_XVID,
    CODEC_ID_PNG,
    CODEC_ID_PPM,
    CODEC_ID_PBM,
    CODEC_ID_PGM,
    CODEC_ID_PGMYUV,
    CODEC_ID_PAM,
    CODEC_ID_FFVHUFF,
    CODEC_ID_RV30,
    CODEC_ID_RV40,
    CODEC_ID_VC1,
    CODEC_ID_WMV3,
    CODEC_ID_LOCO,
    CODEC_ID_WNV1,
    CODEC_ID_AASC,
    CODEC_ID_INDEO2,
    CODEC_ID_FRAPS,
    CODEC_ID_TRUEMOTION2,
    CODEC_ID_BMP,
    CODEC_ID_CSCD,
    CODEC_ID_MMVIDEO,
    CODEC_ID_ZMBV,
    CODEC_ID_AVS,
    CODEC_ID_SMACKVIDEO,
    CODEC_ID_NUV,
    CODEC_ID_KMVC,
    CODEC_ID_FLASHSV,
    CODEC_ID_CAVS,
    CODEC_ID_JPEG2000,
    CODEC_ID_VMNC,
    CODEC_ID_VP5,
    CODEC_ID_VP6,
    CODEC_ID_VP6F,
    CODEC_ID_TARGA,
    CODEC_ID_DSICINVIDEO,
    CODEC_ID_TIERTEXSEQVIDEO,
    CODEC_ID_TIFF,
    CODEC_ID_GIF,
    CODEC_ID_FFH264,
    CODEC_ID_DXA,
    CODEC_ID_DNXHD,
    CODEC_ID_THP,
    CODEC_ID_SGI,
    CODEC_ID_C93,
    CODEC_ID_BETHSOFTVID,
    CODEC_ID_PTX,
    CODEC_ID_TXD,
    CODEC_ID_VP6A,
    CODEC_ID_AMV,
    CODEC_ID_VB,
    CODEC_ID_PCX,
    CODEC_ID_SUNRAST,
    CODEC_ID_INDEO4,
    CODEC_ID_INDEO5,
    CODEC_ID_MIMIC,
    CODEC_ID_RL2,
    CODEC_ID_8SVX_EXP,
    CODEC_ID_8SVX_FIB,
    CODEC_ID_ESCAPE124,
    CODEC_ID_DIRAC,
    CODEC_ID_BFI,
    CODEC_ID_CMV,
    CODEC_ID_MOTIONPIXELS,
    CODEC_ID_TGV,
    CODEC_ID_TGQ,
    CODEC_ID_TQI,
    CODEC_ID_AURA,
    CODEC_ID_AURA2,
    CODEC_ID_V210X,
    CODEC_ID_TMV,
    CODEC_ID_V210,
    CODEC_ID_DPX,
    CODEC_ID_MAD,
    CODEC_ID_FRWU,
    CODEC_ID_FLASHSV2,
    CODEC_ID_CDGRAPHICS,
    CODEC_ID_R210,
    CODEC_ID_ANM,
    CODEC_ID_BINKVIDEO,
    CODEC_ID_IFF_ILBM,
    CODEC_ID_IFF_BYTERUN1,
    CODEC_ID_KGV1,
    CODEC_ID_YOP,
    CODEC_ID_VP8,
    CODEC_ID_PICTOR,
    CODEC_ID_ANSI,
    CODEC_ID_A64_MULTI,
    CODEC_ID_A64_MULTI5,
    CODEC_ID_R10K,
    CODEC_ID_MXPEG,
    CODEC_ID_LAGARITH,
    CODEC_ID_PRORES,
    CODEC_ID_JV,
    CODEC_ID_DFA,
    CODEC_ID_8SVX_RAW,
    CODEC_ID_PCM_S16LE(XugglerJNI.ICodec_CODEC_ID_PCM_S16LE_get()),
    CODEC_ID_PCM_S16BE,
    CODEC_ID_PCM_U16LE,
    CODEC_ID_PCM_U16BE,
    CODEC_ID_PCM_S8,
    CODEC_ID_PCM_U8,
    CODEC_ID_PCM_MULAW,
    CODEC_ID_PCM_ALAW,
    CODEC_ID_PCM_S32LE,
    CODEC_ID_PCM_S32BE,
    CODEC_ID_PCM_U32LE,
    CODEC_ID_PCM_U32BE,
    CODEC_ID_PCM_S24LE,
    CODEC_ID_PCM_S24BE,
    CODEC_ID_PCM_U24LE,
    CODEC_ID_PCM_U24BE,
    CODEC_ID_PCM_S24DAUD,
    CODEC_ID_PCM_ZORK,
    CODEC_ID_PCM_S16LE_PLANAR,
    CODEC_ID_PCM_DVD,
    CODEC_ID_PCM_F32BE,
    CODEC_ID_PCM_F32LE,
    CODEC_ID_PCM_F64BE,
    CODEC_ID_PCM_F64LE,
    CODEC_ID_PCM_BLURAY,
    CODEC_ID_PCM_LXF,
    CODEC_ID_S302M,
    CODEC_ID_ADPCM_IMA_QT(XugglerJNI.ICodec_CODEC_ID_ADPCM_IMA_QT_get()),
    CODEC_ID_ADPCM_IMA_WAV,
    CODEC_ID_ADPCM_IMA_DK3,
    CODEC_ID_ADPCM_IMA_DK4,
    CODEC_ID_ADPCM_IMA_WS,
    CODEC_ID_ADPCM_IMA_SMJPEG,
    CODEC_ID_ADPCM_MS,
    CODEC_ID_ADPCM_4XM,
    CODEC_ID_ADPCM_XA,
    CODEC_ID_ADPCM_ADX,
    CODEC_ID_ADPCM_EA,
    CODEC_ID_ADPCM_G726,
    CODEC_ID_ADPCM_CT,
    CODEC_ID_ADPCM_SWF,
    CODEC_ID_ADPCM_YAMAHA,
    CODEC_ID_ADPCM_SBPRO_4,
    CODEC_ID_ADPCM_SBPRO_3,
    CODEC_ID_ADPCM_SBPRO_2,
    CODEC_ID_ADPCM_THP,
    CODEC_ID_ADPCM_IMA_AMV,
    CODEC_ID_ADPCM_EA_R1,
    CODEC_ID_ADPCM_EA_R3,
    CODEC_ID_ADPCM_EA_R2,
    CODEC_ID_ADPCM_IMA_EA_SEAD,
    CODEC_ID_ADPCM_IMA_EA_EACS,
    CODEC_ID_ADPCM_EA_XAS,
    CODEC_ID_ADPCM_EA_MAXIS_XA,
    CODEC_ID_ADPCM_IMA_ISS,
    CODEC_ID_ADPCM_G722,
    CODEC_ID_AMR_NB(XugglerJNI.ICodec_CODEC_ID_AMR_NB_get()),
    CODEC_ID_AMR_WB,
    CODEC_ID_RA_144(XugglerJNI.ICodec_CODEC_ID_RA_144_get()),
    CODEC_ID_RA_288,
    CODEC_ID_ROQ_DPCM(XugglerJNI.ICodec_CODEC_ID_ROQ_DPCM_get()),
    CODEC_ID_INTERPLAY_DPCM,
    CODEC_ID_XAN_DPCM,
    CODEC_ID_SOL_DPCM,
    CODEC_ID_MP2(XugglerJNI.ICodec_CODEC_ID_MP2_get()),
    CODEC_ID_MP3,
    CODEC_ID_AAC,
    CODEC_ID_AC3,
    CODEC_ID_DTS,
    CODEC_ID_VORBIS,
    CODEC_ID_DVAUDIO,
    CODEC_ID_WMAV1,
    CODEC_ID_WMAV2,
    CODEC_ID_MACE3,
    CODEC_ID_MACE6,
    CODEC_ID_VMDAUDIO,
    CODEC_ID_SONIC,
    CODEC_ID_SONIC_LS,
    CODEC_ID_FLAC,
    CODEC_ID_MP3ADU,
    CODEC_ID_MP3ON4,
    CODEC_ID_SHORTEN,
    CODEC_ID_ALAC,
    CODEC_ID_WESTWOOD_SND1,
    CODEC_ID_GSM,
    CODEC_ID_QDM2,
    CODEC_ID_COOK,
    CODEC_ID_TRUESPEECH,
    CODEC_ID_TTA,
    CODEC_ID_SMACKAUDIO,
    CODEC_ID_QCELP,
    CODEC_ID_WAVPACK,
    CODEC_ID_DSICINAUDIO,
    CODEC_ID_IMC,
    CODEC_ID_MUSEPACK7,
    CODEC_ID_MLP,
    CODEC_ID_GSM_MS,
    CODEC_ID_ATRAC3,
    CODEC_ID_VOXWARE,
    CODEC_ID_APE,
    CODEC_ID_NELLYMOSER,
    CODEC_ID_MUSEPACK8,
    CODEC_ID_SPEEX,
    CODEC_ID_WMAVOICE,
    CODEC_ID_WMAPRO,
    CODEC_ID_WMALOSSLESS,
    CODEC_ID_ATRAC3P,
    CODEC_ID_EAC3,
    CODEC_ID_SIPR,
    CODEC_ID_MP1,
    CODEC_ID_TWINVQ,
    CODEC_ID_TRUEHD,
    CODEC_ID_MP4ALS,
    CODEC_ID_ATRAC1,
    CODEC_ID_BINKAUDIO_RDFT,
    CODEC_ID_BINKAUDIO_DCT,
    CODEC_ID_AAC_LATM,
    CODEC_ID_QDMC,
    CODEC_ID_CELT,
    CODEC_ID_DVD_SUBTITLE(XugglerJNI.ICodec_CODEC_ID_DVD_SUBTITLE_get()),
    CODEC_ID_DVB_SUBTITLE,
    CODEC_ID_TEXT,
    CODEC_ID_XSUB,
    CODEC_ID_SSA,
    CODEC_ID_MOV_TEXT,
    CODEC_ID_HDMV_PGS_SUBTITLE,
    CODEC_ID_DVB_TELETEXT,
    CODEC_ID_SRT,
    CODEC_ID_MICRODVD,
    CODEC_ID_TTF(XugglerJNI.ICodec_CODEC_ID_TTF_get()),
    CODEC_ID_PROBE(XugglerJNI.ICodec_CODEC_ID_PROBE_get()),
    CODEC_ID_MPEG2TS(XugglerJNI.ICodec_CODEC_ID_MPEG2TS_get()),
    CODEC_ID_FFMETADATA(XugglerJNI.ICodec_CODEC_ID_FFMETADATA_get());

    public final int swigValue() {
      return swigValue;
    }

    public static ID swigToEnum(int swigValue) {
      ID[] swigValues = ID.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ID swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ID.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ID() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ID(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ID(ID swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum Type {
  /**
   * The different types of Codecs that can exist in the system.
   */
    CODEC_TYPE_UNKNOWN(XugglerJNI.ICodec_CODEC_TYPE_UNKNOWN_get()),
    CODEC_TYPE_VIDEO,
    CODEC_TYPE_AUDIO,
    CODEC_TYPE_DATA,
    CODEC_TYPE_SUBTITLE,
    CODEC_TYPE_ATTACHMENT;

    public final int swigValue() {
      return swigValue;
    }

    public static Type swigToEnum(int swigValue) {
      Type[] swigValues = Type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Type(Type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum Capabilities {
  /**
   * Capability flags
   */
    CAP_DRAW_HORIZ_BAND(XugglerJNI.ICodec_CAP_DRAW_HORIZ_BAND_get()),
    CAP_DR1(XugglerJNI.ICodec_CAP_DR1_get()),
    CAP_PARSE_ONLY(XugglerJNI.ICodec_CAP_PARSE_ONLY_get()),
    CAP_TRUNCATED(XugglerJNI.ICodec_CAP_TRUNCATED_get()),
    CAP_HWACCEL(XugglerJNI.ICodec_CAP_HWACCEL_get()),
    CAP_DELAY(XugglerJNI.ICodec_CAP_DELAY_get()),
    CAP_SMALL_LAST_FRAME(XugglerJNI.ICodec_CAP_SMALL_LAST_FRAME_get()),
    CAP_HWACCEL_VDPAU(XugglerJNI.ICodec_CAP_HWACCEL_VDPAU_get()),
    CAP_SUBFRAMES(XugglerJNI.ICodec_CAP_SUBFRAMES_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Capabilities swigToEnum(int swigValue) {
      Capabilities[] swigValues = Capabilities.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Capabilities swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Capabilities.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Capabilities() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Capabilities(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Capabilities(Capabilities swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
