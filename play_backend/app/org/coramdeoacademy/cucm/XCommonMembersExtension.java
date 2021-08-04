
package org.coramdeoacademy.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCommonMembersExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCommonMembersExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCommonMembersExtension")
@XmlSeeAlso({
    org.coramdeoacademy.cucm.UpdateUserGroupReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateUserGroupReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateUserGroupReq.Members.class,
    org.coramdeoacademy.cucm.UpdateUserGroupReq.RemoveUserRoles.class,
    org.coramdeoacademy.cucm.UpdateUserGroupReq.AddUserRoles.class,
    org.coramdeoacademy.cucm.UpdateUserGroupReq.UserRoles.class,
    org.coramdeoacademy.cucm.UpdateMobileVoiceAccessReq.RemoveLocales.class,
    org.coramdeoacademy.cucm.UpdateMobileVoiceAccessReq.AddLocales.class,
    org.coramdeoacademy.cucm.UpdateMobileVoiceAccessReq.Locales.class,
    org.coramdeoacademy.cucm.UpdateSipDialRulesReq.RemovePatterns.class,
    org.coramdeoacademy.cucm.UpdateSipDialRulesReq.AddPatterns.class,
    org.coramdeoacademy.cucm.UpdateSipDialRulesReq.Patterns.class,
    org.coramdeoacademy.cucm.UpdateSipDialRulesReq.RemovePlars.class,
    org.coramdeoacademy.cucm.UpdateSipDialRulesReq.AddPlars.class,
    org.coramdeoacademy.cucm.UpdateSipDialRulesReq.Plars.class,
    org.coramdeoacademy.cucm.UpdateRouteFilterReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateRouteFilterReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateRouteFilterReq.Members.class,
    org.coramdeoacademy.cucm.UpdateMediaResourceListReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateMediaResourceListReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateMediaResourceListReq.Members.class,
    org.coramdeoacademy.cucm.UpdateLdapDirectoryReq.RemoveAccessControlGroupInfo.class,
    org.coramdeoacademy.cucm.UpdateLdapDirectoryReq.AddAccessControlGroupInfo.class,
    org.coramdeoacademy.cucm.UpdateLdapDirectoryReq.AccessControlGroupInfo.class,
    org.coramdeoacademy.cucm.UpdateUserReq.RemoveExtensionsInfo.class,
    org.coramdeoacademy.cucm.UpdateUserReq.AddExtensionsInfo.class,
    org.coramdeoacademy.cucm.UpdateUserReq.ExtensionsInfo.class,
    org.coramdeoacademy.cucm.UpdateRouteListReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateRouteListReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateRouteListReq.Members.class,
    org.coramdeoacademy.cucm.UpdateTimeScheduleReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateTimeScheduleReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateTimeScheduleReq.Members.class,
    org.coramdeoacademy.cucm.UpdateLineGroupReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateLineGroupReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateLineGroupReq.Members.class,
    org.coramdeoacademy.cucm.UpdateCcdRequestingServiceReq.RemoveAssociatedTrunks.class,
    org.coramdeoacademy.cucm.UpdateCcdRequestingServiceReq.AddAssociatedTrunks.class,
    org.coramdeoacademy.cucm.UpdateCcdRequestingServiceReq.AssociatedTrunks.class,
    org.coramdeoacademy.cucm.UpdateResourcePriorityNamespaceListReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateResourcePriorityNamespaceListReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateResourcePriorityNamespaceListReq.Members.class,
    org.coramdeoacademy.cucm.UpdateHuntListReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateHuntListReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateHuntListReq.Members.class,
    org.coramdeoacademy.cucm.UpdateMediaResourceGroupReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateMediaResourceGroupReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateMediaResourceGroupReq.Members.class,
    org.coramdeoacademy.cucm.UpdateDateTimeGroupReq.RemovePhoneNtpReferences.class,
    org.coramdeoacademy.cucm.UpdateDateTimeGroupReq.AddPhoneNtpReferences.class,
    org.coramdeoacademy.cucm.UpdateDateTimeGroupReq.PhoneNtpReferences.class,
    org.coramdeoacademy.cucm.UpdateImeClientReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateImeClientReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateImeClientReq.Members.class,
    org.coramdeoacademy.cucm.UpdateImeClientReq.RemoveCcmExternalIpMaps.class,
    org.coramdeoacademy.cucm.UpdateImeClientReq.AddCcmExternalIpMaps.class,
    org.coramdeoacademy.cucm.UpdateImeClientReq.CcmExternalIpMaps.class,
    org.coramdeoacademy.cucm.UpdateElinGroupReq.RemoveElinNumbers.class,
    org.coramdeoacademy.cucm.UpdateElinGroupReq.AddElinNumbers.class,
    org.coramdeoacademy.cucm.UpdateElinGroupReq.ElinNumbers.class,
    org.coramdeoacademy.cucm.UpdateSipTrunkReq.RemoveDestinations.class,
    org.coramdeoacademy.cucm.UpdateSipTrunkReq.AddDestinations.class,
    org.coramdeoacademy.cucm.UpdateSipTrunkReq.Destinations.class,
    org.coramdeoacademy.cucm.UpdateDeviceMobilityReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateDeviceMobilityReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateDeviceMobilityReq.Members.class,
    org.coramdeoacademy.cucm.UpdateLbmHubGroupReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateLbmHubGroupReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateLbmHubGroupReq.Members.class,
    org.coramdeoacademy.cucm.UpdateGeoLocationPolicyReq.RemoveRelatedPolicies.class,
    org.coramdeoacademy.cucm.UpdateGeoLocationPolicyReq.AddRelatedPolicies.class,
    org.coramdeoacademy.cucm.UpdateGeoLocationPolicyReq.RelatedPolicies.class,
    org.coramdeoacademy.cucm.UpdateCallerFilterListReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateCallerFilterListReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateCallerFilterListReq.Members.class,
    org.coramdeoacademy.cucm.UpdateIpPhoneServicesReq.RemoveParameters.class,
    org.coramdeoacademy.cucm.UpdateIpPhoneServicesReq.AddParameters.class,
    org.coramdeoacademy.cucm.UpdateIpPhoneServicesReq.Parameters.class,
    org.coramdeoacademy.cucm.UpdateCssReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateCssReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateCssReq.Members.class,
    org.coramdeoacademy.cucm.UpdateSelfProvisioningReq.RemoveLanguages.class,
    org.coramdeoacademy.cucm.UpdateSelfProvisioningReq.AddLanguages.class,
    org.coramdeoacademy.cucm.UpdateSelfProvisioningReq.Languages.class,
    org.coramdeoacademy.cucm.UpdateWlanProfileGroupReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateWlanProfileGroupReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateWlanProfileGroupReq.Members.class,
    org.coramdeoacademy.cucm.UpdateCallManagerGroupReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateCallManagerGroupReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateCallManagerGroupReq.Members.class,
    org.coramdeoacademy.cucm.UpdateRemoteDestinationReq.RemoveRingSchedule.class,
    org.coramdeoacademy.cucm.UpdateRemoteDestinationReq.AddRingSchedule.class,
    org.coramdeoacademy.cucm.UpdateRemoteDestinationReq.RingSchedule.class,
    org.coramdeoacademy.cucm.UpdateCallPickupGroupReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateCallPickupGroupReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateCallPickupGroupReq.Members.class,
    org.coramdeoacademy.cucm.UpdateApplicationServerReq.RemoveAppUsers.class,
    org.coramdeoacademy.cucm.UpdateApplicationServerReq.AddAppUsers.class,
    org.coramdeoacademy.cucm.UpdateApplicationServerReq.AppUsers.class,
    org.coramdeoacademy.cucm.UpdateApplicationServerReq.RemoveEndUsers.class,
    org.coramdeoacademy.cucm.UpdateApplicationServerReq.AddEndUsers.class,
    org.coramdeoacademy.cucm.UpdateApplicationServerReq.EndUsers.class,
    org.coramdeoacademy.cucm.UpdateH323TrunkReq.RemoveDestinations.class,
    org.coramdeoacademy.cucm.UpdateH323TrunkReq.AddDestinations.class,
    org.coramdeoacademy.cucm.UpdateH323TrunkReq.Destinations.class,
    org.coramdeoacademy.cucm.UpdateRouteGroupReq.RemoveMembers.class,
    org.coramdeoacademy.cucm.UpdateRouteGroupReq.AddMembers.class,
    org.coramdeoacademy.cucm.UpdateRouteGroupReq.Members.class,
    org.coramdeoacademy.cucm.UpdateSafForwarderReq.RemoveAssociatedCucms.class,
    org.coramdeoacademy.cucm.UpdateSafForwarderReq.AddAssociatedCucms.class,
    org.coramdeoacademy.cucm.UpdateSafForwarderReq.AssociatedCucms.class,
    org.coramdeoacademy.cucm.XUserGroup.Members.class,
    org.coramdeoacademy.cucm.XUserGroup.UserRoles.class,
    org.coramdeoacademy.cucm.XLdapDirectory.AccessControlGroupInfo.class,
    org.coramdeoacademy.cucm.XDeviceMobility.Members.class,
    org.coramdeoacademy.cucm.XElinGroup.ElinNumbers.class,
    org.coramdeoacademy.cucm.XCcdRequestingService.AssociatedTrunks.class,
    org.coramdeoacademy.cucm.XGeoLocationPolicy.RelatedPolicies.class,
    org.coramdeoacademy.cucm.XUser.ExtensionsInfo.class,
    org.coramdeoacademy.cucm.XCallPickupGroup.Members.class,
    org.coramdeoacademy.cucm.XResourcePriorityNamespaceList.Members.class,
    org.coramdeoacademy.cucm.XRouteGroup.Members.class,
    org.coramdeoacademy.cucm.XCallerFilterList.Members.class,
    org.coramdeoacademy.cucm.XWlanProfileGroup.Members.class,
    org.coramdeoacademy.cucm.XDateTimeGroup.PhoneNtpReferences.class,
    org.coramdeoacademy.cucm.XHuntList.Members.class,
    org.coramdeoacademy.cucm.XLineGroup.Members.class,
    org.coramdeoacademy.cucm.XRemoteDestination.RingSchedule.class,
    org.coramdeoacademy.cucm.XIpPhoneServices.Parameters.class,
    org.coramdeoacademy.cucm.XApplicationServer.AppUsers.class,
    org.coramdeoacademy.cucm.XApplicationServer.EndUsers.class,
    org.coramdeoacademy.cucm.LElinGroup.ElinNumbers.class,
    org.coramdeoacademy.cucm.XImeClient.Members.class,
    org.coramdeoacademy.cucm.XImeClient.CcmExternalIpMaps.class,
    org.coramdeoacademy.cucm.XRouteList.Members.class,
    org.coramdeoacademy.cucm.XMediaResourceList.Members.class,
    org.coramdeoacademy.cucm.XSafForwarder.AssociatedCucms.class,
    org.coramdeoacademy.cucm.XCss.Members.class,
    org.coramdeoacademy.cucm.XCallManagerGroup.Members.class,
    org.coramdeoacademy.cucm.XMobileVoiceAccess.Locales.class,
    org.coramdeoacademy.cucm.XRouteFilter.Members.class,
    org.coramdeoacademy.cucm.XDdi.Members.class,
    org.coramdeoacademy.cucm.XH323Trunk.Destinations.class,
    org.coramdeoacademy.cucm.XTimeSchedule.Members.class,
    org.coramdeoacademy.cucm.XSdpTransparencyProfile.AttributeSet.class,
    org.coramdeoacademy.cucm.XSipTrunk.Destinations.class,
    org.coramdeoacademy.cucm.XMediaResourceGroup.Members.class,
    org.coramdeoacademy.cucm.LLdapDirectory.AccessControlGroupInfo.class,
    org.coramdeoacademy.cucm.XSipDialRules.Patterns.class,
    org.coramdeoacademy.cucm.XSipDialRules.Plars.class,
    org.coramdeoacademy.cucm.XLbmHubGroup.Members.class
})
public class XCommonMembersExtension {


}