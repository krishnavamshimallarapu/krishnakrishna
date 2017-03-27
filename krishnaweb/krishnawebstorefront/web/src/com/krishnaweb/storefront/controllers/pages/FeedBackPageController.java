/**
 *
 */
package com.krishnaweb.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.krishnaweb.core.data.FeedBackData;
import com.krishnaweb.facades.feedback.facade.FeedBackFacade;
import com.krishnaweb.storefront.form.FeedBackForm;



/**
 * @author krishnavamsi
 *
 */
@Controller
public class FeedBackPageController extends AbstractPageController
{
	@Resource
	FeedBackFacade feedBackFacade;

	protected static final Logger LOG = Logger.getLogger(FeedBackPageController.class);
	private static final String FEEDBACK_PAGE = "FeedBackPage";

	@RequestMapping(value = "/feedback", method = RequestMethod.GET)
	public String contactUs(final FeedBackForm form, final Model model, final HttpServletRequest request,
			final HttpServletResponse response, final HttpSession session) throws CMSItemNotFoundException
	{
		LOG.info("FeedBackPageController==contactUs()==STARTED");
		model.addAttribute("feedBackForm", form);
		storeCmsPageInModel(model, getContentPageForLabelOrId(FEEDBACK_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(FEEDBACK_PAGE));
		return getViewForPage(model);

	}

	@RequestMapping(value = "/feedback", method = RequestMethod.POST)
	public String validateContactUs(final FeedBackForm form, final BindingResult bindingResult, final Model model,
			final HttpServletRequest request, final HttpServletResponse response, final RedirectAttributes redirectModel)
			throws CMSItemNotFoundException
	{
		LOG.info("FeedBackPageController==validateContactUs()==STARTED");
		final FeedBackData feedBackData = new FeedBackData();
		feedBackData.setName(form.getName());
		feedBackData.setEmail(form.getEmail());
		feedBackData.setComment(form.getComment());
		feedBackFacade.getFeedBackData(feedBackData);
		GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER, "form.contactus.thankyou");
		return REDIRECT_PREFIX + "/";

	}


}
