webpackJsonp([14],{"64cE":function(t,e){},W4uv:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n={render:function(){var t=this.$createElement,e=this._self._c||t;return e("div",[e("h2",{staticStyle:{width:"80%","text-align":"center"}},[this._v("小区实时流量需求")]),this._v(" "),e("el-table",{staticStyle:{width:"80%","margin-top":"15px"},attrs:{border:"",data:this.tableData,"span-method":this.arraySpanMethod}},[e("el-table-column",{attrs:{type:"index",label:"序号",width:"60px",align:"center"}}),this._v(" "),e("el-table-column",{attrs:{prop:"plotName",label:"小区名称","min-width":"30%",align:"center"}}),this._v(" "),e("el-table-column",{attrs:{prop:"needWater",label:"流量需求数","min-width":"30%",align:"center"}})],1)],1)},staticRenderFns:[]};var r=a("VU/8")({name:"realTimeWater",data:function(){return{tableData:[{plotName:"荆州新天地",needWater:"53"},{plotName:"荆门新天地",needWater:"110"},{plotName:"荆州碧桂园",needWater:"153"}],time:"2019-02-02 13:20:20",lastRow:{plotName:"更新周期（min）：10",needWater:""}}},beforeMount:function(){this.lastRow.needWater="系统时间："+this.time,this.tableData.push(this.lastRow)},methods:{arraySpanMethod:function(t){t.row,t.column;var e=t.rowIndex,a=t.columnIndex;if(e===this.tableData.length-1){if(0===a)return[0,0];if(1===a)return[1,2]}}}},n,!1,function(t){a("64cE")},"data-v-24c3342e",null);e.default=r.exports}});
//# sourceMappingURL=14.e92f2980ea868125ed25.js.map