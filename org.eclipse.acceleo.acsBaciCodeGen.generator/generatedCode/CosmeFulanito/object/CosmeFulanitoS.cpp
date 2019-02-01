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
// be/be_codegen.cpp:649

#ifndef _TAO_IDL__TMP__COSMEFULANITOS_CPP_
#define _TAO_IDL__TMP__COSMEFULANITOS_CPP_


#include "CosmeFulanitoS.h"
#include "tao/PortableServer/Operation_Table_Perfect_Hash.h"
#include "tao/PortableServer/Upcall_Command.h"
#include "tao/PortableServer/Upcall_Wrapper.h"
#include "tao/TAO_Server_Request.h"
#include "tao/ORB_Core.h"
#include "tao/Profile.h"
#include "tao/Stub.h"
#include "tao/IFR_Client_Adapter.h"
#include "tao/Object_T.h"
#include "tao/AnyTypeCode/TypeCode.h"
#include "tao/AnyTypeCode/DynamicC.h"
#include "tao/CDR.h"
#include "tao/operation_details.h"
#include "tao/PortableInterceptor.h"
#include "ace/Dynamic_Service.h"
#include "ace/Malloc_Allocator.h"

// TAO_IDL - Generated from
// be/be_interface.cpp:1863

class TAO_Sensors_CosmeFulanito_Perfect_Hash_OpTable
  : public TAO_Perfect_Hash_OpTable
{
private:
  unsigned int hash (const char *str, unsigned int len);

public:
  const TAO_operation_db_entry * lookup (const char *str, unsigned int len);
};

/* C++ code produced by gperf version 2.8 (ACE version) */
/* Command-line: /alma/ACS-2018DEC/TAO/ACE_wrappers/build/linux/bin/ace_gperf -m -M -J -c -C -D -E -T -f 0 -F 0,0 -a -o -t -p -K opname -L C++ -Z TAO_Sensors_CosmeFulanito_Perfect_Hash_OpTable -N lookup  */
unsigned int
TAO_Sensors_CosmeFulanito_Perfect_Hash_OpTable::hash (const char *str, unsigned int len)
{
  static const unsigned char asso_values[] =
    {
     29, 29, 29, 29, 29, 29, 29, 29, 29, 29,
     29, 29, 29, 29, 29, 29, 29, 29, 29, 29,
     29, 29, 29, 29, 29, 29, 29, 29, 29, 29,
     29, 29, 29, 29, 29, 29, 29, 29, 29, 29,
     29, 29, 29, 29, 29, 29, 29, 29, 29, 29,
     29, 29, 29, 29, 29, 29, 29, 29, 29, 29,
     29, 29, 29, 29, 29, 29, 29, 29, 29, 29,
     29, 29, 29, 29, 29, 29, 29, 29, 29, 29,
     29, 29, 29, 29, 29, 29, 29, 29, 29, 29,
     29, 29, 29, 29, 29,  0, 29,  0, 29,  5,
      0,  0,  0,  0, 29, 29, 29, 29, 29, 29,
      0,  0,  5, 29, 15,  5,  5, 29, 29, 29,
     29,  0, 29, 29, 29, 29, 29, 29,
    };
  return len + asso_values[static_cast<int>(str[len - 1])] + asso_values[static_cast<int>(str[0])];
}

const TAO_operation_db_entry *
TAO_Sensors_CosmeFulanito_Perfect_Hash_OpTable::lookup (const char *str, unsigned int len)
{
  enum
    {
      TOTAL_KEYWORDS = 19,
      MIN_WORD_LENGTH = 2,
      MAX_WORD_LENGTH = 26,
      MIN_HASH_VALUE = 2,
      MAX_HASH_VALUE = 28,
      HASH_VALUE_RANGE = 27,
      DUPLICATES = 2,
      WORDLIST_SIZE = 21
    };

  static const TAO_operation_db_entry wordlist[] =
    {
      {"",0,0},{"",0,0},
      {"on", &POA_Sensors::CosmeFulanito::on_skel, 0},
      {"off", &POA_Sensors::CosmeFulanito::off_skel, 0},
      {"_is_a", &TAO_ServantBase::_is_a_thru_poa_skel, 0},
      {"_get_name", &POA_ACS::ACSComponent::_get_name_skel, 0},
      {"_interface", &TAO_ServantBase::_interface_skel, 0},
      {"_get_humidity", &POA_Sensors::CosmeFulanito::_get_humidity_skel, 0},
      {"_repository_id", &TAO_ServantBase::_repository_id_thru_poa_skel, 0},
      {"_get_light", &POA_Sensors::CosmeFulanito::_get_light_skel, 0},
      {"_component", &TAO_ServantBase::_component_thru_poa_skel, 0},
      {"_get_temperature", &POA_Sensors::CosmeFulanito::_get_temperature_skel, 0},
      {"_non_existent", &TAO_ServantBase::_non_existent_thru_poa_skel, 0},
      {"_get_componentState", &POA_ACS::ACSComponent::_get_componentState_skel, 0},
      {"publishHumidity", &POA_Sensors::CosmeFulanito::publishHumidity_skel, 0},
      {"publishLight", &POA_Sensors::CosmeFulanito::publishLight_skel, 0},
      {"publishTemperature", &POA_Sensors::CosmeFulanito::publishTemperature_skel, 0},
      {"find_characteristic", &POA_ACS::CharacteristicModel::find_characteristic_skel, 0},
      {"descriptor", &POA_ACS::CharacteristicComponent::descriptor_skel, 0},
      {"get_characteristic_by_name", &POA_ACS::CharacteristicModel::get_characteristic_by_name_skel, 0},
      {"get_all_characteristics", &POA_ACS::CharacteristicModel::get_all_characteristics_skel, 0},
    };

  static const signed char lookup[] =
    {
       -1,  -1,   2,   3,  -1,   4,  -1,  -1,  -1,   5,   6,  -9,  -2,   7, 
        8, -32,  11,  -1,  12,  13,  14,  -1,  15,  16,  17,  18,  19,  -1, 
       20, 
    };

  if (len <= MAX_WORD_LENGTH && len >= MIN_WORD_LENGTH)
    {
      unsigned int key = hash (str, len);

      if (key <= MAX_HASH_VALUE && key >= MIN_HASH_VALUE)
        {
          int slot = lookup[key];

          if (slot >= 0 && slot < WORDLIST_SIZE)
            {
              const char *s = wordlist[slot].opname;

              if (*str == *s && !ACE_OS::strncmp (str + 1, s + 1, len - 1))
                return &wordlist[slot];
            }
          else if (slot < 0 && slot >= -MAX_HASH_VALUE)
            return 0;
          else
            {
              unsigned int offset = key + slot + (slot > 0 ? -MAX_HASH_VALUE : MAX_HASH_VALUE);
              const TAO_operation_db_entry *base = &wordlist[-lookup[offset]];
              const TAO_operation_db_entry *ptr = base + -lookup[offset + 1];

              while (--ptr >= base)
                if (*str == *ptr->opname && !ACE_OS::strncmp (str + 1, ptr->opname + 1, len - 1))
                  return ptr;
            }
        }
    }
  return 0;
}

static TAO_Sensors_CosmeFulanito_Perfect_Hash_OpTable tao_Sensors_CosmeFulanito_optable;

// TAO_IDL - Generated from
// be/be_visitor_interface/interface_ss.cpp:90

POA_Sensors::CosmeFulanito::CosmeFulanito (void)
  : TAO_ServantBase ()
{
  this->optable_ = &tao_Sensors_CosmeFulanito_optable;
}

POA_Sensors::CosmeFulanito::CosmeFulanito (const CosmeFulanito& rhs)
  : TAO_Abstract_ServantBase (rhs),
    TAO_ServantBase (rhs),
    POA_ACS::ACSComponent (rhs),
    POA_ACS::CharacteristicModel (rhs),
    POA_ACS::CharacteristicComponent (rhs)
{
}

POA_Sensors::CosmeFulanito::~CosmeFulanito (void)
{
}

namespace POA_Sensors
{
  

  // TAO_IDL - Generated from
  // be/be_visitor_operation/upcall_command_ss.cpp:80

  class _get_temperature_CosmeFulanito
    : public TAO::Upcall_Command
  {
  public:
    inline _get_temperature_CosmeFulanito (
      POA_Sensors::CosmeFulanito * servant,
      TAO_Operation_Details const * operation_details,
      TAO::Argument * const args[])
      : servant_ (servant)
        , operation_details_ (operation_details)
        , args_ (args)
    {
    }

    virtual void execute (void)
    {
      TAO::SArg_Traits< ::ACS::ROdouble>::ret_arg_type retval =
        TAO::Portable_Server::get_ret_arg< ::ACS::ROdouble> (
          this->operation_details_,
          this->args_);
      
      retval =
        this->servant_->temperature ();
    }
  
  private:
    POA_Sensors::CosmeFulanito * const servant_;
    TAO_Operation_Details const * const operation_details_;
    TAO::Argument * const * const args_;
  };
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_ss.cpp:168

void POA_Sensors::CosmeFulanito::_get_temperature_skel (
  TAO_ServerRequest & server_request,
  TAO::Portable_Server::Servant_Upcall *TAO_INTERCEPTOR (servant_upcall),
  TAO_ServantBase *servant)
{
#if TAO_HAS_INTERCEPTORS == 1
  static ::CORBA::TypeCode_ptr const * const exceptions = 0;
  static ::CORBA::ULong const nexceptions = 0;
#endif /* TAO_HAS_INTERCEPTORS */

  TAO::SArg_Traits< ::ACS::ROdouble>::ret_val retval;

  TAO::Argument * const args[] =
    {
      &retval
    };
  
  static size_t const nargs = 1;

  POA_Sensors::CosmeFulanito * const impl =
    dynamic_cast<POA_Sensors::CosmeFulanito *> (servant);

  if (!impl)
    {
      throw ::CORBA::INTERNAL ();
    }

  _get_temperature_CosmeFulanito command (
    impl,
    server_request.operation_details (),
    args);
  
  TAO::Upcall_Wrapper upcall_wrapper;
  upcall_wrapper.upcall (server_request
                         , args
                         , nargs
                         , command
#if TAO_HAS_INTERCEPTORS == 1
                         , servant_upcall
                         , exceptions
                         , nexceptions
#endif  /* TAO_HAS_INTERCEPTORS == 1 */
                         );
}


namespace POA_Sensors
{
  

  // TAO_IDL - Generated from
  // be/be_visitor_operation/upcall_command_ss.cpp:80

  class _get_humidity_CosmeFulanito
    : public TAO::Upcall_Command
  {
  public:
    inline _get_humidity_CosmeFulanito (
      POA_Sensors::CosmeFulanito * servant,
      TAO_Operation_Details const * operation_details,
      TAO::Argument * const args[])
      : servant_ (servant)
        , operation_details_ (operation_details)
        , args_ (args)
    {
    }

    virtual void execute (void)
    {
      TAO::SArg_Traits< ::ACS::ROdouble>::ret_arg_type retval =
        TAO::Portable_Server::get_ret_arg< ::ACS::ROdouble> (
          this->operation_details_,
          this->args_);
      
      retval =
        this->servant_->humidity ();
    }
  
  private:
    POA_Sensors::CosmeFulanito * const servant_;
    TAO_Operation_Details const * const operation_details_;
    TAO::Argument * const * const args_;
  };
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_ss.cpp:168

void POA_Sensors::CosmeFulanito::_get_humidity_skel (
  TAO_ServerRequest & server_request,
  TAO::Portable_Server::Servant_Upcall *TAO_INTERCEPTOR (servant_upcall),
  TAO_ServantBase *servant)
{
#if TAO_HAS_INTERCEPTORS == 1
  static ::CORBA::TypeCode_ptr const * const exceptions = 0;
  static ::CORBA::ULong const nexceptions = 0;
#endif /* TAO_HAS_INTERCEPTORS */

  TAO::SArg_Traits< ::ACS::ROdouble>::ret_val retval;

  TAO::Argument * const args[] =
    {
      &retval
    };
  
  static size_t const nargs = 1;

  POA_Sensors::CosmeFulanito * const impl =
    dynamic_cast<POA_Sensors::CosmeFulanito *> (servant);

  if (!impl)
    {
      throw ::CORBA::INTERNAL ();
    }

  _get_humidity_CosmeFulanito command (
    impl,
    server_request.operation_details (),
    args);
  
  TAO::Upcall_Wrapper upcall_wrapper;
  upcall_wrapper.upcall (server_request
                         , args
                         , nargs
                         , command
#if TAO_HAS_INTERCEPTORS == 1
                         , servant_upcall
                         , exceptions
                         , nexceptions
#endif  /* TAO_HAS_INTERCEPTORS == 1 */
                         );
}


namespace POA_Sensors
{
  

  // TAO_IDL - Generated from
  // be/be_visitor_operation/upcall_command_ss.cpp:80

  class _get_light_CosmeFulanito
    : public TAO::Upcall_Command
  {
  public:
    inline _get_light_CosmeFulanito (
      POA_Sensors::CosmeFulanito * servant,
      TAO_Operation_Details const * operation_details,
      TAO::Argument * const args[])
      : servant_ (servant)
        , operation_details_ (operation_details)
        , args_ (args)
    {
    }

    virtual void execute (void)
    {
      TAO::SArg_Traits< ::ACS::ROdouble>::ret_arg_type retval =
        TAO::Portable_Server::get_ret_arg< ::ACS::ROdouble> (
          this->operation_details_,
          this->args_);
      
      retval =
        this->servant_->light ();
    }
  
  private:
    POA_Sensors::CosmeFulanito * const servant_;
    TAO_Operation_Details const * const operation_details_;
    TAO::Argument * const * const args_;
  };
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_ss.cpp:168

void POA_Sensors::CosmeFulanito::_get_light_skel (
  TAO_ServerRequest & server_request,
  TAO::Portable_Server::Servant_Upcall *TAO_INTERCEPTOR (servant_upcall),
  TAO_ServantBase *servant)
{
#if TAO_HAS_INTERCEPTORS == 1
  static ::CORBA::TypeCode_ptr const * const exceptions = 0;
  static ::CORBA::ULong const nexceptions = 0;
#endif /* TAO_HAS_INTERCEPTORS */

  TAO::SArg_Traits< ::ACS::ROdouble>::ret_val retval;

  TAO::Argument * const args[] =
    {
      &retval
    };
  
  static size_t const nargs = 1;

  POA_Sensors::CosmeFulanito * const impl =
    dynamic_cast<POA_Sensors::CosmeFulanito *> (servant);

  if (!impl)
    {
      throw ::CORBA::INTERNAL ();
    }

  _get_light_CosmeFulanito command (
    impl,
    server_request.operation_details (),
    args);
  
  TAO::Upcall_Wrapper upcall_wrapper;
  upcall_wrapper.upcall (server_request
                         , args
                         , nargs
                         , command
#if TAO_HAS_INTERCEPTORS == 1
                         , servant_upcall
                         , exceptions
                         , nexceptions
#endif  /* TAO_HAS_INTERCEPTORS == 1 */
                         );
}


namespace POA_Sensors
{
  

  // TAO_IDL - Generated from
  // be/be_visitor_operation/upcall_command_ss.cpp:80

  class on_CosmeFulanito
    : public TAO::Upcall_Command
  {
  public:
    inline on_CosmeFulanito (
      POA_Sensors::CosmeFulanito * servant)
      : servant_ (servant)
    {
    }

    virtual void execute (void)
    {
      this->servant_->on ();
    }
  
  private:
    POA_Sensors::CosmeFulanito * const servant_;
  };
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_ss.cpp:168

void POA_Sensors::CosmeFulanito::on_skel (
  TAO_ServerRequest & server_request,
  TAO::Portable_Server::Servant_Upcall *TAO_INTERCEPTOR (servant_upcall),
  TAO_ServantBase *servant)
{
#if TAO_HAS_INTERCEPTORS == 1
  static ::CORBA::TypeCode_ptr const * const exceptions = 0;
  static ::CORBA::ULong const nexceptions = 0;
#endif /* TAO_HAS_INTERCEPTORS */

  TAO::SArg_Traits< void>::ret_val retval;

  TAO::Argument * const args[] =
    {
      &retval
    };
  
  static size_t const nargs = 1;

  POA_Sensors::CosmeFulanito * const impl =
    dynamic_cast<POA_Sensors::CosmeFulanito *> (servant);

  if (!impl)
    {
      throw ::CORBA::INTERNAL ();
    }

  on_CosmeFulanito command (
    impl);
  
  TAO::Upcall_Wrapper upcall_wrapper;
  upcall_wrapper.upcall (server_request
                         , args
                         , nargs
                         , command
#if TAO_HAS_INTERCEPTORS == 1
                         , servant_upcall
                         , exceptions
                         , nexceptions
#endif  /* TAO_HAS_INTERCEPTORS == 1 */
                         );
}


namespace POA_Sensors
{
  

  // TAO_IDL - Generated from
  // be/be_visitor_operation/upcall_command_ss.cpp:80

  class off_CosmeFulanito
    : public TAO::Upcall_Command
  {
  public:
    inline off_CosmeFulanito (
      POA_Sensors::CosmeFulanito * servant)
      : servant_ (servant)
    {
    }

    virtual void execute (void)
    {
      this->servant_->off ();
    }
  
  private:
    POA_Sensors::CosmeFulanito * const servant_;
  };
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_ss.cpp:168

void POA_Sensors::CosmeFulanito::off_skel (
  TAO_ServerRequest & server_request,
  TAO::Portable_Server::Servant_Upcall *TAO_INTERCEPTOR (servant_upcall),
  TAO_ServantBase *servant)
{
#if TAO_HAS_INTERCEPTORS == 1
  static ::CORBA::TypeCode_ptr const * const exceptions = 0;
  static ::CORBA::ULong const nexceptions = 0;
#endif /* TAO_HAS_INTERCEPTORS */

  TAO::SArg_Traits< void>::ret_val retval;

  TAO::Argument * const args[] =
    {
      &retval
    };
  
  static size_t const nargs = 1;

  POA_Sensors::CosmeFulanito * const impl =
    dynamic_cast<POA_Sensors::CosmeFulanito *> (servant);

  if (!impl)
    {
      throw ::CORBA::INTERNAL ();
    }

  off_CosmeFulanito command (
    impl);
  
  TAO::Upcall_Wrapper upcall_wrapper;
  upcall_wrapper.upcall (server_request
                         , args
                         , nargs
                         , command
#if TAO_HAS_INTERCEPTORS == 1
                         , servant_upcall
                         , exceptions
                         , nexceptions
#endif  /* TAO_HAS_INTERCEPTORS == 1 */
                         );
}


namespace POA_Sensors
{
  

  // TAO_IDL - Generated from
  // be/be_visitor_operation/upcall_command_ss.cpp:80

  class publishTemperature_CosmeFulanito
    : public TAO::Upcall_Command
  {
  public:
    inline publishTemperature_CosmeFulanito (
      POA_Sensors::CosmeFulanito * servant)
      : servant_ (servant)
    {
    }

    virtual void execute (void)
    {
      this->servant_->publishTemperature ();
    }
  
  private:
    POA_Sensors::CosmeFulanito * const servant_;
  };
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_ss.cpp:168

void POA_Sensors::CosmeFulanito::publishTemperature_skel (
  TAO_ServerRequest & server_request,
  TAO::Portable_Server::Servant_Upcall *TAO_INTERCEPTOR (servant_upcall),
  TAO_ServantBase *servant)
{
#if TAO_HAS_INTERCEPTORS == 1
  static ::CORBA::TypeCode_ptr const * const exceptions = 0;
  static ::CORBA::ULong const nexceptions = 0;
#endif /* TAO_HAS_INTERCEPTORS */

  TAO::SArg_Traits< void>::ret_val retval;

  TAO::Argument * const args[] =
    {
      &retval
    };
  
  static size_t const nargs = 1;

  POA_Sensors::CosmeFulanito * const impl =
    dynamic_cast<POA_Sensors::CosmeFulanito *> (servant);

  if (!impl)
    {
      throw ::CORBA::INTERNAL ();
    }

  publishTemperature_CosmeFulanito command (
    impl);
  
  TAO::Upcall_Wrapper upcall_wrapper;
  upcall_wrapper.upcall (server_request
                         , args
                         , nargs
                         , command
#if TAO_HAS_INTERCEPTORS == 1
                         , servant_upcall
                         , exceptions
                         , nexceptions
#endif  /* TAO_HAS_INTERCEPTORS == 1 */
                         );
}


namespace POA_Sensors
{
  

  // TAO_IDL - Generated from
  // be/be_visitor_operation/upcall_command_ss.cpp:80

  class publishLight_CosmeFulanito
    : public TAO::Upcall_Command
  {
  public:
    inline publishLight_CosmeFulanito (
      POA_Sensors::CosmeFulanito * servant)
      : servant_ (servant)
    {
    }

    virtual void execute (void)
    {
      this->servant_->publishLight ();
    }
  
  private:
    POA_Sensors::CosmeFulanito * const servant_;
  };
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_ss.cpp:168

void POA_Sensors::CosmeFulanito::publishLight_skel (
  TAO_ServerRequest & server_request,
  TAO::Portable_Server::Servant_Upcall *TAO_INTERCEPTOR (servant_upcall),
  TAO_ServantBase *servant)
{
#if TAO_HAS_INTERCEPTORS == 1
  static ::CORBA::TypeCode_ptr const * const exceptions = 0;
  static ::CORBA::ULong const nexceptions = 0;
#endif /* TAO_HAS_INTERCEPTORS */

  TAO::SArg_Traits< void>::ret_val retval;

  TAO::Argument * const args[] =
    {
      &retval
    };
  
  static size_t const nargs = 1;

  POA_Sensors::CosmeFulanito * const impl =
    dynamic_cast<POA_Sensors::CosmeFulanito *> (servant);

  if (!impl)
    {
      throw ::CORBA::INTERNAL ();
    }

  publishLight_CosmeFulanito command (
    impl);
  
  TAO::Upcall_Wrapper upcall_wrapper;
  upcall_wrapper.upcall (server_request
                         , args
                         , nargs
                         , command
#if TAO_HAS_INTERCEPTORS == 1
                         , servant_upcall
                         , exceptions
                         , nexceptions
#endif  /* TAO_HAS_INTERCEPTORS == 1 */
                         );
}


namespace POA_Sensors
{
  

  // TAO_IDL - Generated from
  // be/be_visitor_operation/upcall_command_ss.cpp:80

  class publishHumidity_CosmeFulanito
    : public TAO::Upcall_Command
  {
  public:
    inline publishHumidity_CosmeFulanito (
      POA_Sensors::CosmeFulanito * servant)
      : servant_ (servant)
    {
    }

    virtual void execute (void)
    {
      this->servant_->publishHumidity ();
    }
  
  private:
    POA_Sensors::CosmeFulanito * const servant_;
  };
}

// TAO_IDL - Generated from
// be/be_visitor_operation/operation_ss.cpp:168

void POA_Sensors::CosmeFulanito::publishHumidity_skel (
  TAO_ServerRequest & server_request,
  TAO::Portable_Server::Servant_Upcall *TAO_INTERCEPTOR (servant_upcall),
  TAO_ServantBase *servant)
{
#if TAO_HAS_INTERCEPTORS == 1
  static ::CORBA::TypeCode_ptr const * const exceptions = 0;
  static ::CORBA::ULong const nexceptions = 0;
#endif /* TAO_HAS_INTERCEPTORS */

  TAO::SArg_Traits< void>::ret_val retval;

  TAO::Argument * const args[] =
    {
      &retval
    };
  
  static size_t const nargs = 1;

  POA_Sensors::CosmeFulanito * const impl =
    dynamic_cast<POA_Sensors::CosmeFulanito *> (servant);

  if (!impl)
    {
      throw ::CORBA::INTERNAL ();
    }

  publishHumidity_CosmeFulanito command (
    impl);
  
  TAO::Upcall_Wrapper upcall_wrapper;
  upcall_wrapper.upcall (server_request
                         , args
                         , nargs
                         , command
#if TAO_HAS_INTERCEPTORS == 1
                         , servant_upcall
                         , exceptions
                         , nexceptions
#endif  /* TAO_HAS_INTERCEPTORS == 1 */
                         );
}



// TAO_IDL - Generated from
// be/be_visitor_interface/interface_ss.cpp:163



::CORBA::Boolean POA_Sensors::CosmeFulanito::_is_a (const char* value)
{
  return
    (
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
      !ACE_OS::strcmp (
          value,
          "IDL:omg.org/CORBA/Object:1.0"
        )
    );
}

const char* POA_Sensors::CosmeFulanito::_interface_repository_id (void) const
{
  return "IDL:alma/Sensors/CosmeFulanito:1.0";
}

// TAO_IDL - Generated from
// be/be_visitor_interface/interface_ss.cpp:423

void POA_Sensors::CosmeFulanito::_dispatch (
  TAO_ServerRequest & req,
  TAO::Portable_Server::Servant_Upcall* servant_upcall)
{
  this->synchronous_upcall_dispatch (req, servant_upcall, this);
}

// TAO_IDL - Generated from
// be/be_visitor_interface/interface_ss.cpp:370

Sensors::CosmeFulanito *
POA_Sensors::CosmeFulanito::_this (void)
{
  TAO_Stub *stub = this->_create_stub ();

  TAO_Stub_Auto_Ptr safe_stub (stub);
  ::CORBA::Object_ptr tmp = CORBA::Object_ptr ();

  ::CORBA::Boolean const _tao_opt_colloc =
    stub->servant_orb_var ()->orb_core ()->optimize_collocation_objects ();
  
  ACE_NEW_RETURN (
      tmp,
      ::CORBA::Object (stub, _tao_opt_colloc, this),
      0);
  
  ::CORBA::Object_var obj = tmp;
  (void) safe_stub.release ();

  typedef ::Sensors::CosmeFulanito STUB_SCOPED_NAME;
  return
    TAO::Narrow_Utils<STUB_SCOPED_NAME>::unchecked_narrow (
        obj.in ());
}

#endif /* ifndef */
