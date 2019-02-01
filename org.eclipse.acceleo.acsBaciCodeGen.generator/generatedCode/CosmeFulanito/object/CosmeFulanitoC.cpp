// -*- C++ -*-
/**
 * Code generated by the The ACE ORB (TAO) IDL Compiler v2.4.3
 * TAO and the TAO IDL Compiler have been developed by:
 *       Center for Distributed Object Computing
 *       Washington University
 *       St. Louis, MO
 *       USA
 *       http://www.cs.wustl.edu/~schmidt/doc-center.html
 * and
 *       Distributed Object Computing Laboratory
 *       University of California at Irvine
 *       Irvine, CA
 *       USA
 * and
 *       Institute for Software Integrated Systems
 *       Vanderbilt University
 *       Nashville, TN
 *       USA
 *       http://www.isis.vanderbilt.edu/
 *
 * Information about TAO is available at:
 *     http://www.dre.vanderbilt.edu/~schmidt/TAO.html
 **/

// TAO_IDL - Generated from
// be/be_codegen.cpp:373


#include "CosmeFulanitoC.h"
#include "tao/AnyTypeCode/Null_RefCount_Policy.h"
#include "tao/AnyTypeCode/TypeCode_Constants.h"
#include "tao/AnyTypeCode/Alias_TypeCode_Static.h"
#include "tao/AnyTypeCode/Objref_TypeCode_Static.h"
#include "tao/CDR.h"
#include "tao/Exception_Data.h"
#include "tao/Invocation_Adapter.h"
#include "tao/Object_T.h"
#include "tao/CDR.h"
#include "tao/AnyTypeCode/Any.h"
#include "tao/AnyTypeCode/Any_Impl_T.h"
#include "ace/OS_NS_string.h"

#if !defined (__ACE_INLINE__)
#include "CosmeFulanitoC.inl"
#endif /* !defined INLINE */

// TAO_IDL - Generated from
// be/be_visitor_interface/interface_cs.cpp:48
TAO_BEGIN_VERSIONED_NAMESPACE_DECL

// Traits specializations for Sensors::CosmeFulanito.

Sensors::CosmeFulanito_ptr
TAO::Objref_Traits<Sensors::CosmeFulanito>::duplicate (
    Sensors::CosmeFulanito_ptr p)
{
  return Sensors::CosmeFulanito::_duplicate (p);
}

void
TAO::Objref_Traits<Sensors::CosmeFulanito>::release (
    Sensors::CosmeFulanito_ptr p)
{
  ::CORBA::release (p);
}

Sensors::CosmeFulanito_ptr
TAO::Objref_Traits<Sensors::CosmeFulanito>::nil (void)
{
  return Sensors::CosmeFulanito::_nil ();
}

::CORBA::Boolean
TAO::Objref_Traits<Sensors::CosmeFulanito>::marshal (
    const Sensors::CosmeFulanito_ptr p,
    TAO_OutputCDR & cdr)
{
  return ::CORBA::Object::marshal (p, cdr);
}

TAO_END_VERSIONED_NAMESPACE_DECL



// TAO_IDL - Generated from
// be/be_visitor_operation/operation_cs.cpp:88

::ACS::ROdouble_ptr
Sensors::CosmeFulanito::temperature (
  void)
{
  if (!this->is_evaluated ())
    {
      ::CORBA::Object::tao_object_initialize (this);
    }
  
  TAO::Arg_Traits< ::ACS::ROdouble>::ret_val _tao_retval;

  TAO::Argument *_the_tao_operation_signature [] =
    {
      &_tao_retval
    };

  TAO::Invocation_Adapter _tao_call (
      this,
      _the_tao_operation_signature,
      1,
      "_get_temperature",
      16,
      TAO::TAO_CO_NONE | TAO::TAO_CO_THRU_POA_STRATEGY,
      TAO::TAO_TWOWAY_INVOCATION
      ,
      TAO::TAO_SYNCHRONOUS_INVOCATION,
      false
    );

  _tao_call.invoke (0, 0);

  return _tao_retval.retn ();
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_cs.cpp:88

::ACS::ROdouble_ptr
Sensors::CosmeFulanito::humidity (
  void)
{
  if (!this->is_evaluated ())
    {
      ::CORBA::Object::tao_object_initialize (this);
    }
  
  TAO::Arg_Traits< ::ACS::ROdouble>::ret_val _tao_retval;

  TAO::Argument *_the_tao_operation_signature [] =
    {
      &_tao_retval
    };

  TAO::Invocation_Adapter _tao_call (
      this,
      _the_tao_operation_signature,
      1,
      "_get_humidity",
      13,
      TAO::TAO_CO_NONE | TAO::TAO_CO_THRU_POA_STRATEGY,
      TAO::TAO_TWOWAY_INVOCATION
      ,
      TAO::TAO_SYNCHRONOUS_INVOCATION,
      false
    );

  _tao_call.invoke (0, 0);

  return _tao_retval.retn ();
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_cs.cpp:88

::ACS::ROdouble_ptr
Sensors::CosmeFulanito::light (
  void)
{
  if (!this->is_evaluated ())
    {
      ::CORBA::Object::tao_object_initialize (this);
    }
  
  TAO::Arg_Traits< ::ACS::ROdouble>::ret_val _tao_retval;

  TAO::Argument *_the_tao_operation_signature [] =
    {
      &_tao_retval
    };

  TAO::Invocation_Adapter _tao_call (
      this,
      _the_tao_operation_signature,
      1,
      "_get_light",
      10,
      TAO::TAO_CO_NONE | TAO::TAO_CO_THRU_POA_STRATEGY,
      TAO::TAO_TWOWAY_INVOCATION
      ,
      TAO::TAO_SYNCHRONOUS_INVOCATION,
      false
    );

  _tao_call.invoke (0, 0);

  return _tao_retval.retn ();
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_cs.cpp:88

void
Sensors::CosmeFulanito::on (
  void)
{
  if (!this->is_evaluated ())
    {
      ::CORBA::Object::tao_object_initialize (this);
    }
  
  TAO::Arg_Traits< void>::ret_val _tao_retval;

  TAO::Argument *_the_tao_operation_signature [] =
    {
      &_tao_retval
    };

  TAO::Invocation_Adapter _tao_call (
      this,
      _the_tao_operation_signature,
      1,
      "on",
      2,
      TAO::TAO_CO_NONE | TAO::TAO_CO_THRU_POA_STRATEGY,
      TAO::TAO_TWOWAY_INVOCATION
      ,
      TAO::TAO_SYNCHRONOUS_INVOCATION,
      false
    );

  _tao_call.invoke (0, 0);
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_cs.cpp:88

void
Sensors::CosmeFulanito::off (
  void)
{
  if (!this->is_evaluated ())
    {
      ::CORBA::Object::tao_object_initialize (this);
    }
  
  TAO::Arg_Traits< void>::ret_val _tao_retval;

  TAO::Argument *_the_tao_operation_signature [] =
    {
      &_tao_retval
    };

  TAO::Invocation_Adapter _tao_call (
      this,
      _the_tao_operation_signature,
      1,
      "off",
      3,
      TAO::TAO_CO_NONE | TAO::TAO_CO_THRU_POA_STRATEGY,
      TAO::TAO_TWOWAY_INVOCATION
      ,
      TAO::TAO_SYNCHRONOUS_INVOCATION,
      false
    );

  _tao_call.invoke (0, 0);
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_cs.cpp:88

void
Sensors::CosmeFulanito::publishTemperature (
  void)
{
  if (!this->is_evaluated ())
    {
      ::CORBA::Object::tao_object_initialize (this);
    }
  
  TAO::Arg_Traits< void>::ret_val _tao_retval;

  TAO::Argument *_the_tao_operation_signature [] =
    {
      &_tao_retval
    };

  TAO::Invocation_Adapter _tao_call (
      this,
      _the_tao_operation_signature,
      1,
      "publishTemperature",
      18,
      TAO::TAO_CO_NONE | TAO::TAO_CO_THRU_POA_STRATEGY,
      TAO::TAO_TWOWAY_INVOCATION
      ,
      TAO::TAO_SYNCHRONOUS_INVOCATION,
      false
    );

  _tao_call.invoke (0, 0);
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_cs.cpp:88

void
Sensors::CosmeFulanito::publishLight (
  void)
{
  if (!this->is_evaluated ())
    {
      ::CORBA::Object::tao_object_initialize (this);
    }
  
  TAO::Arg_Traits< void>::ret_val _tao_retval;

  TAO::Argument *_the_tao_operation_signature [] =
    {
      &_tao_retval
    };

  TAO::Invocation_Adapter _tao_call (
      this,
      _the_tao_operation_signature,
      1,
      "publishLight",
      12,
      TAO::TAO_CO_NONE | TAO::TAO_CO_THRU_POA_STRATEGY,
      TAO::TAO_TWOWAY_INVOCATION
      ,
      TAO::TAO_SYNCHRONOUS_INVOCATION,
      false
    );

  _tao_call.invoke (0, 0);
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_cs.cpp:88

void
Sensors::CosmeFulanito::publishHumidity (
  void)
{
  if (!this->is_evaluated ())
    {
      ::CORBA::Object::tao_object_initialize (this);
    }
  
  TAO::Arg_Traits< void>::ret_val _tao_retval;

  TAO::Argument *_the_tao_operation_signature [] =
    {
      &_tao_retval
    };

  TAO::Invocation_Adapter _tao_call (
      this,
      _the_tao_operation_signature,
      1,
      "publishHumidity",
      15,
      TAO::TAO_CO_NONE | TAO::TAO_CO_THRU_POA_STRATEGY,
      TAO::TAO_TWOWAY_INVOCATION
      ,
      TAO::TAO_SYNCHRONOUS_INVOCATION,
      false
    );

  _tao_call.invoke (0, 0);
}

Sensors::CosmeFulanito::CosmeFulanito (void)
{
}

Sensors::CosmeFulanito::~CosmeFulanito (void)
{
}

void
Sensors::CosmeFulanito::_tao_any_destructor (void *_tao_void_pointer)
{
  CosmeFulanito *_tao_tmp_pointer =
    static_cast<CosmeFulanito *> (_tao_void_pointer);
  ::CORBA::release (_tao_tmp_pointer);
}

Sensors::CosmeFulanito_ptr
Sensors::CosmeFulanito::_narrow (
    ::CORBA::Object_ptr _tao_objref)
{
  return
    TAO::Narrow_Utils<CosmeFulanito>::narrow (
        _tao_objref,
        "IDL:alma/Sensors/CosmeFulanito:1.0");
}

Sensors::CosmeFulanito_ptr
Sensors::CosmeFulanito::_unchecked_narrow (
    ::CORBA::Object_ptr _tao_objref)
{
  return
    TAO::Narrow_Utils<CosmeFulanito>::unchecked_narrow (
        _tao_objref);
}

Sensors::CosmeFulanito_ptr
Sensors::CosmeFulanito::_nil (void)
{
  return 0;
}

Sensors::CosmeFulanito_ptr
Sensors::CosmeFulanito::_duplicate (CosmeFulanito_ptr obj)
{
  if (! ::CORBA::is_nil (obj))
    {
      obj->_add_ref ();
    }
  return obj;
}

void
Sensors::CosmeFulanito::_tao_release (CosmeFulanito_ptr obj)
{
  ::CORBA::release (obj);
}

::CORBA::Boolean
Sensors::CosmeFulanito::_is_a (const char *value)
{
  if (
      ACE_OS::strcmp (
          value,
          "IDL:alma/ACS/ACSComponent:1.0"
        ) == 0 ||
      ACE_OS::strcmp (
          value,
          "IDL:alma/ACS/CharacteristicModel:1.0"
        ) == 0 ||
      ACE_OS::strcmp (
          value,
          "IDL:alma/ACS/CharacteristicComponent:1.0"
        ) == 0 ||
      ACE_OS::strcmp (
          value,
          "IDL:alma/Sensors/CosmeFulanito:1.0"
        ) == 0 ||
      ACE_OS::strcmp (
          value,
          "IDL:omg.org/CORBA/Object:1.0"
        ) == 0
    )
    {
      return true; // success using local knowledge
    }
  else
    {
      return this->::CORBA::Object::_is_a (value);
    }
}

const char* Sensors::CosmeFulanito::_interface_repository_id (void) const
{
  return "IDL:alma/Sensors/CosmeFulanito:1.0";
}

::CORBA::Boolean
Sensors::CosmeFulanito::marshal (TAO_OutputCDR &cdr)
{
  return (cdr << this);
}

// TAO_IDL - Generated from
// be/be_visitor_typecode/objref_typecode.cpp:70

static TAO::TypeCode::Objref<char const *,
                             TAO::Null_RefCount_Policy>
  _tao_tc_Sensors_CosmeFulanito (
    ::CORBA::tk_objref,
    "IDL:alma/Sensors/CosmeFulanito:1.0",
    "CosmeFulanito");
  

namespace Sensors
{
  ::CORBA::TypeCode_ptr const _tc_CosmeFulanito =
    &_tao_tc_Sensors_CosmeFulanito;
}

// TAO_IDL - Generated from
// be/be_visitor_interface/any_op_cs.cpp:38
TAO_BEGIN_VERSIONED_NAMESPACE_DECL



namespace TAO
{
  template<>
  ::CORBA::Boolean
  Any_Impl_T<Sensors::CosmeFulanito>::to_object (
      ::CORBA::Object_ptr &_tao_elem) const
  {
    _tao_elem = ::CORBA::Object::_duplicate (this->value_);
    return true;
  }
}
TAO_END_VERSIONED_NAMESPACE_DECL



#if defined (ACE_ANY_OPS_USE_NAMESPACE)

namespace Sensors
{
  

  /// Copying insertion.
  void
  operator<<= (
      ::CORBA::Any &_tao_any,
      CosmeFulanito_ptr _tao_elem)
  {
    CosmeFulanito_ptr _tao_objptr =
      CosmeFulanito::_duplicate (_tao_elem);
    _tao_any <<= &_tao_objptr;
  }

  /// Non-copying insertion.
  void
  operator<<= (
      ::CORBA::Any &_tao_any,
      CosmeFulanito_ptr *_tao_elem)
  {
    TAO::Any_Impl_T<CosmeFulanito>::insert (
        _tao_any,
        CosmeFulanito::_tao_any_destructor,
        _tc_CosmeFulanito,
        *_tao_elem);
  }

  ::CORBA::Boolean
  operator>>= (
      const ::CORBA::Any &_tao_any,
      CosmeFulanito_ptr &_tao_elem)
  {
    return
      TAO::Any_Impl_T<CosmeFulanito>::extract (
          _tao_any,
          CosmeFulanito::_tao_any_destructor,
          _tc_CosmeFulanito,
          _tao_elem);
  }
}

#else

TAO_BEGIN_VERSIONED_NAMESPACE_DECL



/// Copying insertion.
void
operator<<= (
    ::CORBA::Any &_tao_any,
    Sensors::CosmeFulanito_ptr _tao_elem)
{
  Sensors::CosmeFulanito_ptr _tao_objptr =
    Sensors::CosmeFulanito::_duplicate (_tao_elem);
  _tao_any <<= &_tao_objptr;
}

/// Non-copying insertion.
void
operator<<= (
    ::CORBA::Any &_tao_any,
    Sensors::CosmeFulanito_ptr *_tao_elem)
{
  TAO::Any_Impl_T<Sensors::CosmeFulanito>::insert (
      _tao_any,
      Sensors::CosmeFulanito::_tao_any_destructor,
      Sensors::_tc_CosmeFulanito,
      *_tao_elem);
}

::CORBA::Boolean
operator>>= (
    const ::CORBA::Any &_tao_any,
    Sensors::CosmeFulanito_ptr &_tao_elem)
{
  return
    TAO::Any_Impl_T<Sensors::CosmeFulanito>::extract (
        _tao_any,
        Sensors::CosmeFulanito::_tao_any_destructor,
        Sensors::_tc_CosmeFulanito,
        _tao_elem);
}

TAO_END_VERSIONED_NAMESPACE_DECL



#endif

// TAO_IDL - Generated from
// be/be_visitor_interface/cdr_op_cs.cpp:51

TAO_BEGIN_VERSIONED_NAMESPACE_DECL

::CORBA::Boolean operator<< (
    TAO_OutputCDR &strm,
    const Sensors::CosmeFulanito_ptr _tao_objref)
{
  ::CORBA::Object_ptr _tao_corba_obj = _tao_objref;
  return (strm << _tao_corba_obj);
}

::CORBA::Boolean operator>> (
    TAO_InputCDR &strm,
    Sensors::CosmeFulanito_ptr &_tao_objref)
{
  ::CORBA::Object_var obj;

  if (!(strm >> obj.inout ()))
    {
      return false;
    }
  
  typedef ::Sensors::CosmeFulanito RHS_SCOPED_NAME;

  // Narrow to the right type.
  _tao_objref =
    TAO::Narrow_Utils<RHS_SCOPED_NAME>::unchecked_narrow (obj.in ());
    
  return true;
}

TAO_END_VERSIONED_NAMESPACE_DECL



