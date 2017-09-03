package de.bitfork;

public class AppPropertyName {

	// Locale
	public static final String LANGUAGE_LOCALE_DA = "da";
	public static final String LANGUAGE_LOCALE_NO = "no";
	public static final String LANGUAGE_LOCALE_SV = "sv";
	public static final String LANGUAGE_LOCALE_EN = "en";

	public static final String[] SUPPLIER_NAMES = { "Domæne", "Nej", "planlægges", "<1/3", "<2/3", ">2/3", "ja",
			"Ved ikke", "Kan ej besvares" };

	// Views
	public static final String MINE_DATA_VIEW_GET = "nordsecstamdata";
	public static final String NORDSEC_STATUS_VIEW_GET = "nordsecstatus";
	public static final String BRIX_STATUS_VIEW_GET = "brixstatus";
	public static final String BRIX_STATUS_EXTEND_VIEW_GET = "brixstatusextend";
	public static final String REDIRECT_BRIX_VIEW = "redirect:/brix";

	// Status improvement
	public static final String STATUS_IMPROVEMENT_PAGE = "toolboxstatusimprovement";
	public static final String TASK_OVERVIEW_PAGE = "taskoverview";

	// Toolbox views
	public static final String TOOLBOX_SoA_VIEW = "soa";
	public static final String TOOLBOX_COLLABORATION_VIEW = "toolboxCollaboration";

	// Date patterns
	public static final String DEFAULT_SURVEYS_DATE_PATTERN = "yyyy-MM-dd";

	// Colors
	public static final String CHART_COLOR_GREEN = "#19B873";
	public static final String CHART_COLOR_RED = "#C96262";
	public static final String COLOR_WHITE = "#fff";
	public static final String COLOR_LIGHT_GREY = "#ececec";
	public static final String COLOR_GREY = "#cacaca";

	// Organizations type ids
	public static final Integer ORGANIZATION_ENERGY_TYPE_ID = 4;

	public static final String DE = "DE";
	public static final String NORDSEC = "nordsec";

	// Default communes count that displayed result on chart
	public static final Integer DEFAULT_COMMUNES_COUNT = 3;

	// mail text code
	public static final String MAIL_TEXT_CODE = "web.registration.mail.text";
	public static final String MAIL_TEXT_HEAD_CODE = "web.registration.mail.head";
	public static final String INVITE_MAIL_TEXT_SUBJECT_CODE = "web.user.invite.mail.text.subject";
	public static final String INVITE_MAIL_TEXT_BODY_CODE = "web.user.invite.mail.text.body";
	public static final String CONFIRM_MAIL_TEXT = "web.user.comfirm.mail.text";
	public static final String RESET_PASSWORD_MAIL_TEXT = "web.user.reset.password.mail.text";

	public static final String MAIL_TASK_TEXT_BODY = "web.user.task.text.body";
	public static final String MAIL_TASK_TEXT_SUBJECT = "web.user.task.text.subject";
	public static final String MAIL_UPDATE_TASK_TEXT_BODY = "web.user.update.task.text.body";
	public static final String MAIL_UPDATE_TASK_TEXT_SUBJECT = "web.user.update.task.text.subject";

	// Links
	public static final String EMAIL_TASK_VIEW_LINK = "<a href='http://enablor.dk/activ?par=$params'>$task</a><br>";

	// Series
	public static final String FILTER_SERIES = "Filter";
	public static final String SPONSOR_FILTER_SERIES_FIRST = "Filter 1";
	public static final String SPONSOR_FILTER_SERIES_SECOND = "Filter 2";
	public static final String CLUSTER_SERIES = "Koncern";

	// Service setting
	public static final String SERVICE_DEFAULT_EMAIL = "enablor@enablor.dk";
	public static final String DEFAULT_ACTIVE_URL_TEST_SERVER = "http://test.analysis.i-trust.dk/activ?par=";
	public static final String DEFAULT_ACTIVE_URL_PRODUCTION = "http://enablor.dk/activ?par=";
	public static final String DEFAULT_RESET_PASSWORD_URL_PRODUCTION = "http://enablor.dk/reset-password?par=";

	public static final Integer DEFAULT_NUMBER_MESSAGES_ON_HOMEPAGE = 5;

	// soa report
	public static final String SOA_CHART_SERIES_DEFAULT_NAME = "web.soa.report.chart.series.label";

	// Parameters
	public static final String USER_CAN_ANSVER_FOR_QUESTIONS_PARAMETER = "userCanAnsverForQuestions";

	public static final Integer FTE_CHART_ID = 7;

	public static final Integer SPONSOR_ROLE_ID = 13;

	public static final Integer DEFAULT_CHARTBAR_COLSPAN_IN_SOA_REPORT = 7;
	public static final String DEFAULT_CONTROL_POINT_MARGIN_LEFT_IN_REPORT = "20";
	public static final String DEFAULT_CHARTBAR_MARGIN_LEFT_IN_REPORT = "5";
	public static final String DEFAULT_CHARTBARSUB_MARGIN_LEFT_IN_REPORT = "15";

	/* Charts */
	public static final Double BW_CHART_DEFAULT_ELEMENT_VALUE = 0.04;

	/* Entities' fields */
	public static final String ID_ENTITY_FIELD = "id";
	public static final String VALUE_ENTITY_FIELD = "value";
	public static final String UNIQE_ENTITY_FIELD = "uniqe";
	public static final String ORGANISATION_ID_FIELD = "organisationId";

	/* Basket sessions attribute */
	public static final String BASKET_ITEM_IDS = "basketItemIds";
	public static final String QUESTION_IDS = "questionIds";
	
}
